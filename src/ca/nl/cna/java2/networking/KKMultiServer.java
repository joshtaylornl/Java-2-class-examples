package ca.nl.cna.java2.networking;

import java.net.*;
import java.io.*;

public class KKMultiServer {
    public static void main(String[] args) throws IOException {

        int portNumber = 4401; //Integer.parseInt(args[0]);
        boolean listening = true;

        try (ServerSocket serverSocket = new ServerSocket(portNumber)) {
            while (listening) {
                new KKMultiServerThread(serverSocket.accept()).start();
            }
        } catch (IOException e) {
            System.err.println("Could not listen on port " + portNumber);
            System.exit(-1);
        }
    }
}