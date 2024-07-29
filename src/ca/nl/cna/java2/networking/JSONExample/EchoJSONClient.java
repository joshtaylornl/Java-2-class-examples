package ca.nl.cna.java2.networking.JSONExample;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import org.json.simple.JSONObject;

public class EchoJSONClient {
    public static void main(String[] args) throws IOException {

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
                //out.println(userInput);
                JSONObject jsonObject = EchoJSONObject.getFooObject(userInput);
                System.out.println("Debug: " + jsonObject.toJSONString());
                out.println(jsonObject.toJSONString());
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