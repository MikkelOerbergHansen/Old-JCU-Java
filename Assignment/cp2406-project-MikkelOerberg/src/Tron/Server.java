package Tron;

import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;

// the server that can be run as a console
public class Server {
    // a unique ID for each connection
    private static int uniqueId;
    // an ArrayList to keep the list of the Client
    private ArrayList<ClientThread> clients;
    // to display time
    private SimpleDateFormat sdf;
    // the port number to listen for connection
    private int port;
    // to check if server is running
    private int state;

    private static String colors[] = {"red", "blue", "green", "yellow", "cyan", "magenta", "gray", "white", "purple", "orange"};

    private int totalClients = 0;

    private ArrayList<Lightcycle> lightCycles;
    private ArrayList<String> leaderBoardNames = new ArrayList<String>();
    private ArrayList<Integer> leaderBoardScores = new ArrayList<Integer>();


    private final static int BOARD_SIZE = 600;
    Random rand = new Random();

    private final static int WAITING = 1, RUNNING = 2, GAMEOVER = 3, STOPPED = 4;

    private int step = 0;

    private BufferedImage image = new BufferedImage(BOARD_SIZE, BOARD_SIZE, BufferedImage.TYPE_INT_ARGB);

    //constructor that receive the port to listen to for connection as parameter

    public Server(int port) {
        // the port
        this.port = port;
        // to display hh:mm:ss
        sdf = new SimpleDateFormat("HH:mm:ss");
        // an ArrayList to keep the list of the Client
        clients = new ArrayList<ClientThread>();
    }

    public void start() {
        state = WAITING;
        //create socket server and wait for connection requests
        try
        {
            // the socket used by the server
            ServerSocket serverSocket = new ServerSocket(port);
            serverSocket.setSoTimeout(50);

            //System.out.println("Tron.Server waiting for clients on port " + serverSocket.getInetAddress());

            // infinite loop to wait for connections ( till server is active )
            while(state == WAITING) {


                // accept connection if requested from client
                Socket socket;
                try {
                    socket = serverSocket.accept();
                }
                catch (SocketTimeoutException e) {
                    // break if server stoped
                    if(state != WAITING)
                        break;
                    continue;
                }

                // if client is connected, create its thread
                ClientThread t = new ClientThread(socket);
                //add this client to arraylist
                t.start();
            }

            Lightcycle winner = null;
            while(state == RUNNING) {
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e){
                    System.out.println(e);
                }
                int alive_players = 0;
                for (int i = 0; i < lightCycles.size(); ++i) {
                    Lightcycle lightcycle = lightCycles.get(i);
                    if(lightcycle.isAlive())
                        lightcycle.moveOneStep(image);
                    if(lightcycle.isAlive()) {
                        alive_players++;
                        winner = lightcycle;
                    }
                }
                broadcastState();

                if(alive_players <= 1) {
                    state = GAMEOVER;
                    int score = winner.getLength();
                    boolean added = false;
                    for(int i = leaderBoardScores.size() - 1; i >= 0; i--) {
                        if (score < leaderBoardScores.get(i)) {
                            leaderBoardScores.add(i+1, score);
                            leaderBoardNames.add(i+1, winner.getName());
                            added = true;
                            break;
                        }
                    }
                    if(!added){
                        leaderBoardScores.add(0, score);
                        leaderBoardNames.add(0, winner.getName());
                    }

                    FileOutputStream fos = new FileOutputStream(new File("leaderboard.txt"));
                    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
                    for (int i = 0; i < leaderBoardScores.size(); i++) {
                        bw.write(String.format("%s,%d", leaderBoardNames.get(i), leaderBoardScores.get(i)));
                        bw.newLine();
                    }
                    bw.close();
                }
            }

            while(state == GAMEOVER) {
                StringBuilder builder = new StringBuilder();
                for (int i = 0; i < leaderBoardScores.size(); i++) {
                    if(i >= 10) break;
                    if(i == 0)
                        builder.append(String.format("%s,%d", leaderBoardNames.get(i), leaderBoardScores.get(i)));
                    else
                        builder.append(String.format(" %s,%d", leaderBoardNames.get(i), leaderBoardScores.get(i)));
                }
                broadcast("LEADERBOARD:" + builder.toString());
                broadcast("WINNER:" + winner.getName());
                break;
            }

            // try to stop the server
            try {
                serverSocket.close();
                for(int i = 0; i < clients.size(); ++i) {
                    ClientThread tc = clients.get(i);
                    try {
                        // close all data streams and socket
                        tc.sInput.close();
                        tc.sOutput.close();
                        tc.socket.close();
                    }
                    catch(IOException e) {}
                }
            }
            catch(Exception e) {
                display("Exception closing the server and clients: " + e);
            }
        }
        catch (IOException e) {
            String msg = sdf.format(new Date()) + " Exception on new ServerSocket: " + e + "\n";
            display(msg);
        }
    }

    // to stop the server
    protected void stop() {
        state = STOPPED;
        try {
            new Socket("localhost", port);
        }
        catch(Exception e) {
        }
    }

    // Display an event to the console
    private void display(String msg) {
        String time = sdf.format(new Date()) + " " + msg;
        System.out.println(time);
    }

    // to broadcast a message to all Clients
    private synchronized boolean broadcast(String message) {
        // add timestamp to the message
        String time = sdf.format(new Date());

        String messageLf = time + " " + message + "\n";
        // display message
        System.out.print(messageLf);

        // we loop in reverse order in case we would have to remove a Client
        // because it has disconnected
        for(int i = clients.size(); --i >= 0;) {
            ClientThread ct = clients.get(i);
            // try to write to the Client if it fails remove it from the list
            if(!ct.writeMsg(message)) {
                clients.remove(i);
                display("Disconnected Client " + ct.username + " removed from list.");
            }
        }
        return true;
    }

    private synchronized boolean broadcastInitialState() {

        StringBuilder messageBuilder = new StringBuilder();
        for (int i = 0; i < clients.size(); ++i) {
            ClientThread client = clients.get(i);
            // try to write to the Client if it fails remove it from the list
            if(messageBuilder.length() == 0)
                messageBuilder.append(client.username+","+client.color);
            else
                messageBuilder.append(" ").append(client.username+","+client.color);
        }

        String stateMsgs = messageBuilder.toString();

        for (int i = 0; i < clients.size(); ++i) {
            clients.get(i).writeMsg("STATE:"+stateMsgs);
        }
        return true;
    }

    private synchronized boolean broadcastState() {

        StringBuilder messageBuilder = new StringBuilder();
        for (int i = 0; i < lightCycles.size(); ++i) {
            Lightcycle lightcycle = lightCycles.get(i);

            int broadcastStep = lightcycle.getLastBroadCastStep();
            for(int s = broadcastStep; s < lightcycle.getSteps().size(); ++s) {
                if(messageBuilder.length() == 0)
                    messageBuilder.append(lightcycle.getStepString(s));
                else
                    messageBuilder.append(" ").append(lightcycle.getStepString(s));
            }
            lightcycle.setLastBroadCastStep(lightcycle.getSteps().size());
        }

        String stepMsgs = messageBuilder.toString();

        for (int i = 0; i < clients.size(); ++i) {
            clients.get(i).writeMsg("MSG:"+stepMsgs);
        }
        return true;
    }


    // if client sent LOGOUT message to exit
    synchronized void remove(int id) {
        // scan the array list until we found the Id
        for(int i = 0; i < clients.size(); ++i) {
            ClientThread ct = clients.get(i);
            // if found remove it
            if(ct.id == id) {
                clients.remove(i);
                break;
            }
        }
    }

    synchronized int canRegister(String username, String color) {
        for(int i = 0; i < clients.size(); ++i) {
            ClientThread ct = clients.get(i);
            if (ct.username.equals(username)) {
                return 1;
            } else if (ct.color.equals(color)) {
                return 2;
            }
        }
        if(!Arrays.asList(colors).contains(color))
            return 3;
        return 0;
    }

    private int findLightcycle(String username) {
        for(int i = 0; i < lightCycles.size(); i++) {
            Lightcycle lightcycle = lightCycles.get(i);
            if (lightcycle.getName() == username)
                return i;
        }
        return -1;
    }

    /*
     *  To run Server application
     * If the port number is not specified 1500 is used
     */
    public static void main(String[] args) {
        // start server on port 1500 unless a PortNumber is specified
        int portNumber = 1500;

        int userCount = 2;

        do {
            JTextField countField = new JTextField(String.valueOf(userCount));
            Object[] message = {
                    "Client count:", countField
            };

            int option = JOptionPane.showConfirmDialog(null, message, "Create", JOptionPane.OK_CANCEL_OPTION);
            if (option == JOptionPane.OK_OPTION) {
                userCount = Integer.parseInt(countField.getText());
            } else {
                System.exit(0);
            }
            if(userCount < 2 || userCount > 10)
                userCount = 0;
        }while(userCount == 0);

        // create a server object and start it
        Server server = new Server(portNumber);

        try{
            BufferedReader br = new BufferedReader(new FileReader("leaderboard.txt"));
            for(String line; (line = br.readLine()) != null; ) {
                String tokens[] = line.split(",");
                if(tokens.length >= 2) {
                    server.leaderBoardNames.add(tokens[0]);
                    server.leaderBoardScores.add(Integer.parseInt(tokens[1]));
                }
            }
        } catch(Exception e) {}

        server.totalClients = userCount;
        server.start();

    }

    // One instance of this thread will run for each client
    class ClientThread extends Thread {
        // the socket to get messages from client
        Socket socket;
        BufferedReader sInput;
        BufferedWriter sOutput;
        // my unique id (easier for deconnection)
        int id;
        // the Username of the Client
        String username;
        String color;
        // message object to receive message and its type
        String cm;
        // timestamp
        String date;

        // Constructor
        ClientThread(Socket socket) {
            // a unique id
            id = ++uniqueId;
            this.socket = socket;
            //Creating both Data Stream
            System.out.println("Thread trying to create Object Input/Output Streams");
            try {
                sOutput = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
                sInput  = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            } catch (IOException e) {
                display("Exception creating new Input/output Streams: " + e);
                return;
            }
            date = new Date().toString() + "\n";
        }



        // infinite loop to read and forward message
        public void run() {
            while(true) {
                // read the username
                String loginMessage = readMsg();
                String tokens[] = loginMessage.split(":");
                if (!tokens[0].equals("ADD USER")) {
                    close();
                    return;
                }
                String infotokens[] = tokens[1].split(",");
                username = infotokens[0];
                color = infotokens[1];
                int error = canRegister(username, color);
                if (error == 0) {
                    writeMsg("OKAY");
                    clients.add(this);
                    break;
                } else {
                    writeMsg(String.format("FAILED:%d", error));
                }

                broadcast(username + " has joined.");
            }

            if(clients.size() == totalClients) {
                step = 1;
                lightCycles = new ArrayList<>();
                for(int i = 0; i < clients.size(); ++i) {
                    Lightcycle lightcycle = new Lightcycle(clients.get(i).username, clients.get(i).color,
                            1, (int) (Math.random() * 4), true);
                    lightcycle.addStep(rand.nextInt((BOARD_SIZE/10*8 - BOARD_SIZE/5) + 1) + BOARD_SIZE/5,
                            rand.nextInt((BOARD_SIZE/10*8 - BOARD_SIZE/5) + 1) + BOARD_SIZE/5, true);
                    lightCycles.add(lightcycle);
                }

                broadcastInitialState();
                broadcastState();
                state = RUNNING;
            }

            // to loop until LOGOUT
            boolean keepWaiting = true;
            while(keepWaiting) {
                // read a String (which is an object)
                cm = readMsg();
                // get the message from the LCMessage object received
                String tokens[] = cm.split(":");

                // different actions based on type message
                if(tokens[0].equals("MSG")) {
                    boolean confirmation = broadcast(username + ": " + tokens[1]);
                    if (confirmation == false) {
                        String msg = "Sorry. No such user exists.";
                        writeMsg(msg);
                    }
                } else if(tokens[0].equals("LOGOUT")) {
                    display(username + " disconnected with a LOGOUT message.");
                    keepWaiting = false;
                } else if(tokens[0].equals("USER")) {
                    String subtokens[] = tokens[1].split(" ");
                    int ind = findLightcycle(username);
                    if (ind >= 0) {
                        Lightcycle lightcycle = lightCycles.get(ind);

                        if (subtokens[1].equals("GO")) {
                            if (subtokens[2].equals("faster")) {
                                lightcycle.speedUp();
                                display(username + " goes faster");
                            } else if (subtokens[2].equals("slower")) {
                                lightcycle.speedDown();
                                display(username + " goes slower");
                            }
                        } else if (subtokens[1].equals("JETWALL")) {
                            if (subtokens[2].equals("on")) {
                                lightcycle.setJetWall(true);
                                display(username + " turns jetwall on");
                            } else if (subtokens[2].equals("off")) {
                                lightcycle.setJetWall(false);
                                display(username + " turns jetwall off");
                            }
                        } else if (subtokens[1].equals("TURN")) {
                            if (subtokens[2].equals("clockwise")) {
                                lightcycle.turnClockwise();
                                display(username + " turns clockwise");
                            } else if (subtokens[2].equals("anticlockwise")) {
                                lightcycle.turnAnticlockwise();
                                display(username + " turns anticlockwise");
                            }
                        }
                    }
                } else if(tokens[0].equals("WHOISIN")) {
                    writeMsg("List of the users connected at " + sdf.format(new Date()) + "\n");
                    // send list of active clients
                    for(int i = 0; i < clients.size(); ++i) {
                        ClientThread ct = clients.get(i);
                        writeMsg((i+1) + ") " + ct.username + " since " + ct.date);
                    }
                }
            }
            // if out of the loop then disconnected and remove from client list
            remove(id);
            close();
        }

        // close everything
        private void close() {
            try {
                if(sOutput != null) sOutput.close();
            }
            catch(Exception e) {}
            try {
                if(sInput != null) sInput.close();
            }
            catch(Exception e) {};
            try {
                if(socket != null) socket.close();
            }
            catch (Exception e) {}
        }

        // write a String to the Client output stream
        private boolean writeMsg(String msg) {
            // if Client is still connected send the message to it
            if(!socket.isConnected()) {
                close();
                return false;
            }
            // write the message to the stream
            try {
                sOutput.write(msg);
                sOutput.newLine();
                sOutput.flush();
            }
            // if an error occurs, do not abort just inform the user
            catch(IOException e) {
                display("Error sending message");
                display(e.toString());
            }
            return true;
        }

        private String readMsg() {
            // if Client is still connected send the message to it
            if(!socket.isConnected()) {
                close();
                return "";
            }
            // write the message to the stream
            try {
                return sInput.readLine();
            }
            // if an error occurs, do not abort just inform the user
            catch(IOException e) {
                display("Error receiving message");
                display(e.toString());
            }
            return "";
        }
    }
}


