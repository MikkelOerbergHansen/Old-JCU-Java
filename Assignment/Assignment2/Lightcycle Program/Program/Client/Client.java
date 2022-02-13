package Program.Client;


import Program.Lightcycle;
import Program.LightcycleStep;

import java.net.*;
import java.io.*;
import java.util.*;


//The Client that can be run as a console
public class Client  {

    // notification
    private String notif = " *** ";

    // for I/O
    private ObjectInputStream sInput;		// to read from the socket
    private ObjectOutputStream sOutput;		// to write on the socket
    private ListenFromServer listeningServer;
    private Socket socket;					// socket object

    private String server, username;	// server and username
    private String color;               // color
    private int port;					// port
    private boolean jetWall;            // jet wall
    private static String colors[] = {"red", "blue", "green", "yellow", "cyan", "magenta", "gray", "white", "purple", "orange"};
    private boolean loginSuccess = false;

    private ArrayList<Lightcycle> lightcycles;

    private final static int BOARD_SIZE = 1000;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    /*
     *  Constructor to set below things
     *  server: the server address
     *  port: the port number
     *  username: the username
     */

    Client(String server, int port, String username, String color) {
        this.server = server;
        this.port = port;
        this.username = username;
        this.color = color;
        this.jetWall = true;
    }

    /*
     * To start the game
     */
    public boolean start() {
        // try to connect to the server
        try {
            socket = new Socket(server, port);
        }
        // exception handler if it failed
        catch(Exception ec) {
            display("Error connection to server:" + ec);
            return false;
        }

        String msg = "Connection accepted " + socket.getInetAddress() + ":" + socket.getPort();
        display(msg);

        /* Creating both Data Stream */
        try
        {
            sInput  = new ObjectInputStream(socket.getInputStream());
            sOutput = new ObjectOutputStream(socket.getOutputStream());
        }
        catch (IOException eIO) {
            display("Exception creating new Input/output Streams: " + eIO);
            return false;
        }

        // creates the Thread to listen from the server
        listeningServer = new ListenFromServer();
        listeningServer.start();
        // Send our username to the server this is the only message that we
        // will send as a String. All other messages will be LCMessage objects
        // success we inform the caller that it worked
        return true;
    }

    /*
     * To send a message to the console
     */
    private void display(String msg) {

        System.out.println(msg);

    }

    /*
     * To send a message to the server
     */
    void sendMessage(String msg) {
        try {
            sOutput.writeObject(msg);
        }
        catch(IOException e) {
            display("Exception writing to server: " + e);
        }
    }

    void sendLoginMessage(){
        try
        {
            String message = "ADD USER:" + username + "," + color;
            sOutput.writeObject(message);
        }
        catch (IOException eIO) {
            display("Exception doing login : " + eIO);
            disconnect();
            return;
        }
    }

    private synchronized void setLoginSuccess(boolean success){
        loginSuccess = success;
    }

    private synchronized boolean getLoginSuccess(){
        return loginSuccess;
    }

    /*
     * When something goes wrong
     * Close the Input/Output streams and disconnect
     */
    private void disconnect() {
        try {
            if(sInput != null) sInput.close();
        }
        catch(Exception e) {}
        try {
            if(sOutput != null) sOutput.close();
        }
        catch(Exception e) {}
        try{
            if(socket != null) socket.close();
        }
        catch(Exception e) {}
    }

    private int findTron(String username) {
        for(int i = 0; i < lightcycles.size(); i++) {
            Lightcycle lightcycle = lightcycles.get(i);
            if (lightcycle.getName() == username)
                return i;
        }
        return -1;
    }

    private static String getColorInput() {
        Scanner scan = new Scanner(System.in);
        String color = "";
        while( color.isEmpty() ) {
            System.out.println("Select color: red blue green yellow cyan magenta gray white purple orange");
            color = scan.nextLine();
            if(!Arrays.asList(colors).contains(color))
                color = "";
        }
        return color;
    }

    /*
     * To start the Client in console mode use one of the following command
     * > java Client
     * > java Client username
     * > java Client username portNumber
     * > java Client username portNumber serverAddress
     * at the console prompt
     * If the portNumber is not specified 1500 is used
     * If the serverAddress is not specified "localHost" is used
     * If the username is not specified "Anonymous" is used
     */
    public static void main(String[] args) {
        // default values if not entered
        int portNumber = 1500;
        String serverAddress = "localhost";
        String userName = "Anonymous";
        String color = "";
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the username: ");
        userName = scan.nextLine();

        color = getColorInput();

        // create the Client object
        Client client = new Client(serverAddress, portNumber, userName, color);
        // try to connect to the server and return if not connected
        if(!client.start())
            return;

        client.sendLoginMessage();

        while(!client.getLoginSuccess());

        System.out.println("\nHello.! Welcome to the light-cycle.");
        System.out.println("Instructions:");
        System.out.println("1. Simply type the message to send broadcast to all active clients");
        System.out.println("2. Type '@username<space>yourmessage' without quotes to send message to desired client");
        System.out.println("3. Type 'WHOISIN' without quotes to see list of active clients");
        System.out.println("4. Type 'LOGOUT' without quotes to logoff from server");

        // infinite loop to get the input from the user
        while(true) {
            // read message from user
            String msg = scan.nextLine();
            // logout if message is LOGOUT
            if(msg.equalsIgnoreCase("a")) {
                client.sendMessage("USER:"+client.username+" TURN anticlockwise");
            } else if(msg.equalsIgnoreCase("d")) {
                client.sendMessage("USER:"+client.username+" TURN clockwise");
            } else if(msg.equalsIgnoreCase("w")) {
                client.sendMessage("USER:"+client.username+" GO faster");
            } else if(msg.equalsIgnoreCase("s")) {
                client.sendMessage("USER:"+client.username+" GO slower");
            } else if(msg.equalsIgnoreCase("e")) {
                if(client.jetWall) {
                    client.jetWall = false;
                    client.sendMessage("USER:" + client.username + " JETWALL off");
                } else{
                    client.jetWall = true;
                    client.sendMessage("USER:" + client.username + " JETWALL on");
                }
            } else if(msg.equalsIgnoreCase("LOGOUT")) {
                client.sendMessage("LOGOUT");
                break;
            }
            // message to check who are present in light cycle.
            else if(msg.equalsIgnoreCase("WHOISIN")) {
                client.sendMessage("WHOISIN");
            }
            // regular text message
            else {
                client.sendMessage("MSG:"+msg);
            }
        }
        // close resource
        scan.close();
        // client completed its job. disconnect client.
        client.disconnect();
    }

    /*
     * a class that waits for the message from the server
     */
    class ListenFromServer extends Thread {

        public void run() {
            while(true) {
                try {
                    // read the message form the input datastream
                    String msg = (String) sInput.readObject();
                    String tokens[] = msg.split(":");
                    if(tokens[0].equals("FAILED")){
                        switch (Integer.parseInt(tokens[1])) {
                            case 1:
                                Scanner scan = new Scanner(System.in);
                                System.out.println("User name duplicate. Please choose another name.");
                                System.out.println("Enter the username: ");
                                username = scan.nextLine();
                                sendLoginMessage();
                                break;
                            case 2:
                                System.out.println("Light cycle color duplicate. Please choose another one.");
                                color = getColorInput();
                                sendLoginMessage();
                                break;
                            default:
                        }
                    } else if(tokens[0].equals("OKAY")){
                        setLoginSuccess(true);
                    } else if(tokens[0].equals("STATE")){
                        String stateMsgs[] = tokens[1].split(" ");
                        lightcycles = new ArrayList<>();
                        for(int i = 0; i < stateMsgs.length; ++i) {
                            String stateTokens[] = stateMsgs[i].split(",");
                            String username = stateTokens[0];
                            String color = stateTokens[1];
                            lightcycles.add(new Lightcycle(username, color, 1, Lightcycle.UP, true));
                        }
                        System.out.println(String.format("Trons: %d", lightcycles.size()));
                    } else if(tokens[0].equals("MSG")){
                        String stepMsgs[] = tokens[1].split(" ");
//                        System.out.println(String.format("Step messages: %d", stepMsgs.length));
                        for(int i = 0; i < stepMsgs.length; ++i) {
                            String stepTokens[] = stepMsgs[i].split(",");
                            String username = stepTokens[0];
                            int x = Integer.parseInt(stepTokens[1]);
                            int y = Integer.parseInt(stepTokens[2]);
                            boolean on = stepTokens[3].equals("on")?true:false;

                            int tron_ind = findTron(username);
                            if(tron_ind < 0)
                                continue;
                            lightcycles.get(tron_ind).getSteps().add(new LightcycleStep(x, y, on));
                        }
                    }
                }
                catch(IOException e) {
                    display(notif + "Server has closed the connection: " + e + notif);
                    break;
                }
                catch(ClassNotFoundException e2) {
                }
            }
        }
    }
}

