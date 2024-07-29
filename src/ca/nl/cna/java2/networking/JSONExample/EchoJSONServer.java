package ca.nl.cna.java2.networking.JSONExample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoJSONServer {
    public static void main(String[] args) throws IOException {

//        if (args.length != 1) {
//            System.err.println("Usage: java EchoServer <port number>");
//            System.exit(1);
//        }
//
//        int portNumber = Integer.parseInt(args[0]);

        int portNumber = 8800;

        try (
                //Set up a ServerSocket on a port to accept connections from clients
                ServerSocket serverSocket = new ServerSocket(portNumber);
                //Set up client Socket to be able to communicate with the client
                Socket clientSocket = serverSocket.accept();
                //Set up a PrintWriter to the client Socket
                PrintWriter out =
                        new PrintWriter(clientSocket.getOutputStream(), true);
                //Set up a BufferedReader to read incoming from the client Socket
                BufferedReader in = new BufferedReader(
                        new InputStreamReader(clientSocket.getInputStream()));
        ) {
            String inputLine;
            //Loop when connected until the input is null or program is terminated
            while ((inputLine = in.readLine()) != null) {

                out.println(inputLine);

                System.out.println(inputLine);
            }
        } catch (IOException e) {
            System.out.println("Exception caught when trying to listen on port "
                    + portNumber + " or listening for a connection");
            System.out.println(e.getMessage());
        }
    }
}