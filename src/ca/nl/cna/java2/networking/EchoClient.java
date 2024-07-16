package ca.nl.cna.java2.networking;
import java.io.*;
import java.net.*;

public class EchoClient {
    public static void main(String[] args) throws IOException {

        /*if (args.length != 2) {
            System.err.println(
                    "Usage: java EchoClient <host name> <port number>");
            System.exit(1);
        }

        String hostName = args[0];
        int portNumber = Integer.parseInt(args[1]);*/

        System.out.println("Fun with Sockets");

        String hostName = "localhost";
        int portNumber = 8800;

        try (
                //Set up the Socket - point it to the server
                Socket echoSocket = new Socket(hostName, portNumber);
                //Set up a PrintWrite to the Socket
                PrintWriter out =
                        new PrintWriter(echoSocket.getOutputStream(), true);
                //Set up a BufferedReader to read from the socket
                BufferedReader in = new BufferedReader(
                        new InputStreamReader(echoSocket.getInputStream()));
                //Set up a BufferedReader to read from the console (input from the user on the client side)
                BufferedReader stdIn = new BufferedReader(
                        new InputStreamReader(System.in))
        ) {
            String userInput;
            while ((userInput = stdIn.readLine()) != null) {
                out.println(userInput);
                System.out.println("echo: " + in.readLine());
            }
        } catch (UnknownHostException e) {
            System.err.println("Don't know about host " + hostName);
            System.exit(1);
        } catch (IOException e) {
            //This will happen if the Server isn't running
            System.err.println("Couldn't get I/O for the connection to " +
                    hostName);
            System.exit(1);
        }
    }
}