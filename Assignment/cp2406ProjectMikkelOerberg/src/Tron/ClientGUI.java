package Assignment.cp2406ProjectMikkelOerberg.src.Tron;//import Tron.Lightcycle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.*;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;


public class ClientGUI extends JDialog {

    // for I/O
    private BufferedReader sInput;		// to read from the socket
    private BufferedWriter sOutput;		// to write on the socket
    private ListenFromServer listeningServer;
    private Socket socket;					// socket object

    private String server, username;	// server and username
    private String color;               // color
    private int port;					// port
    private boolean jetWall;            // jet wall
    private boolean loginSuccess = false;
    public boolean gameOver = false;
    public ArrayList<String> leaderBoardNames = new ArrayList<String>();
    public ArrayList<Integer> leaderBoardScores = new ArrayList<Integer>();
    public int winner_ind;
    public ArrayList<Lightcycle> lightCycles;

    private final static int BOARD_SIZE = 600;

    /*
     *  Constructor to set below things
     *  server: the server address
     *  port: the port number
     *  username: the username
     */

    ClientGUI(String server, int port, String username, String color) {
        super(null, Dialog.ModalityType.APPLICATION_MODAL);
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

        /* Creating input and output Data Streams */
        try
        {
            sOutput = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            sInput  = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        }
        catch (IOException eIO) {
            display("Exception creating new Input/output Streams: " + eIO);
            return false;
        }

        // creates the Thread to listen from the server
        listeningServer = new ListenFromServer();
        listeningServer.start();

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
        writeMsg(msg);
    }




    void sendLoginMessage(){
        String message = "ADD USER:" + username + "," + color;
        writeMsg(message);
    }




    private synchronized void setLoginSuccess(boolean success){
        loginSuccess = success;
    }


    /*
     * When something goes wrong
     * Close the Input/Output streams and close
     */
    private void close() {
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




    private int findLightcycle(String username) {
        for(int i = 0; i < lightCycles.size(); i++) {
            Lightcycle lightcycle = lightCycles.get(i);
            if (lightcycle.getName().equals(username))
                return i;
        }
        return -1;
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







    /*
     * To start the Client:
     * If the portNumber is not specified 1500 is used
     * If the serverAddress is not specified "localHost" is used
     * If the username is not specified "Anonymous" is used
     */
    public static void main(String[] args) {
        // default values if not entered
        int portNumber = 1500;
        String serverAddress = "localhost";
        String username = "Anonymous";
        String color = "";

        JTextField addressField = new JTextField(serverAddress);
        JTextField usernameField = new JTextField(username);
        JTextField colorField = new JTextField(color);
        Object[] message = {
                "Tron.Server Ip:", addressField,
                "Username:", usernameField,
                "Color:", colorField
        };

        int option = JOptionPane.showConfirmDialog(null, message, "Login", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) {
            username = usernameField.getText();
            color = colorField.getText();
            serverAddress = addressField.getText();
        } else {
            System.exit(0);
        }


        // create the Client object
        ClientGUI client = new ClientGUI(serverAddress, portNumber, username, color);
        // try to connect to the server and return if not connected
        if(!client.start())
            return;

        client.sendLoginMessage();


        System.out.println("\nHello.! Welcome to the light-cycle.");

        client.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent ev){
                client.sendMessage("LOGOUT");
                System.exit(0);
            }
        });

        client.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if(!client.gameOver) {
                    super.keyPressed(e);
                    if (e.getKeyCode() == KeyEvent.VK_A)
                        client.sendMessage("USER:" + client.username + " TURN anticlockwise");
                    else if (e.getKeyCode() == KeyEvent.VK_D)
                        client.sendMessage("USER:" + client.username + " TURN clockwise");
                    else if (e.getKeyCode() == KeyEvent.VK_W)
                        client.sendMessage("USER:" + client.username + " GO faster");
                    else if (e.getKeyCode() == KeyEvent.VK_S)
                        client.sendMessage("USER:" + client.username + " GO slower");
                    else if (e.getKeyCode() == KeyEvent.VK_E) {
                        if (client.jetWall) {
                            client.jetWall = false;
                            client.sendMessage("USER:" + client.username + " JETWALL off");
                        } else {
                            client.jetWall = true;
                            client.sendMessage("USER:" + client.username + " JETWALL on");
                        }
                    } else if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
                        client.sendMessage("LOGOUT");
                    }
                }

            }
        });


        LeaderBoard lb = new LeaderBoard(BOARD_SIZE,25, client);
        client.add(lb);
        lb.setVisible(true);
        lb.repaint();

        TronBoard tb = new TronBoard(BOARD_SIZE,BOARD_SIZE, client);
        client.add(tb);
        tb.setVisible(true);
        tb.repaint();

        client.setSize(BOARD_SIZE+40,BOARD_SIZE+65);
        client.setTitle("Tron Light Cycles");
        client.setResizable(false);
        client.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);



        Timer timer = new Timer();
        timer.schedule(new TimerTask(){
            @Override
            public void run() {
                tb.repaint();
                lb.repaint();
            }
        },50,100);

        client.setVisible(true);
    }

















    /*
     * a class that waits for the message from the server
     */
    class ListenFromServer extends Thread {

        public void run() {
            boolean dummy = true;
            while(dummy) {
                // read the message form the input datastream
                String msg = readMsg();
                String tokens[] = msg.split(":");
                if(tokens[0].equals("FAILED")){
                    int errCode = Integer.parseInt(tokens[1]);

                    JTextField usernameField = new JTextField(username);
                    JTextField colorField = new JTextField(color);
                    Object[] message = {
                            errCode == 1?"User name duplicates.":(errCode == 2?"Color duplicates.":"Color invalid"),
                            "Username:", usernameField,
                            "Color:", colorField
                    };

                    int option = JOptionPane.showConfirmDialog(null, message, "Login", JOptionPane.OK_CANCEL_OPTION);
                    if (option == JOptionPane.OK_OPTION) {
                        username = usernameField.getText();
                        color = colorField.getText();
                    } else {
                        System.exit(0);
                    }

                    if (Integer.parseInt(tokens[1]) != 0)
                        sendLoginMessage();

                } else if(tokens[0].equals("OKAY")){
                    setLoginSuccess(true);
                } else if(tokens[0].equals("STATE")){
                    String stateMsgs[] = tokens[1].split(" ");
                    lightCycles = new ArrayList<>();
                    for(int i = 0; i < stateMsgs.length; ++i) {
                        String stateTokens[] = stateMsgs[i].split(",");
                        String username = stateTokens[0];
                        String color = stateTokens[1];
                        lightCycles.add(new Lightcycle(username, color, 1, Lightcycle.UP, true));
                    }
                    System.out.println(String.format("Trons: %d", lightCycles.size()));
                } else if(tokens[0].equals("MSG")){
                    String stepMsgs[] = tokens[1].split(" ");
                    for(int i = 0; i < stepMsgs.length; ++i) {
                        String stepTokens[] = stepMsgs[i].split(",");
                        String username = stepTokens[0];
                        int x = Integer.parseInt(stepTokens[1]);
                        int y = Integer.parseInt(stepTokens[2]);
                        boolean on = stepTokens[3].equals("on");

                        int tron_ind = findLightcycle(username);
                        if(tron_ind < 0)
                            continue;
                        lightCycles.get(tron_ind).addStep(x, y, on);
                    }
                } else if(tokens[0].equals("LEADERBOARD")){
                    String boardItems[] = tokens[1].split(" ");
                    for(int i = 0; i < boardItems.length; ++i) {
                        String itemTokens[] = boardItems[i].split(",");
                        leaderBoardNames.add(itemTokens[0]);
                        leaderBoardScores.add(Integer.parseInt(itemTokens[1]));
                    }
                } else if(tokens[0].equals("WINNER")){
                    String username = tokens[1];
                    gameOver = true;

                    winner_ind = findLightcycle(username);
                    dummy = false;
                }
            }
        }

    }





}


