import java.io.*;
import java.net.*;

public class SimpleClient {
    public static void main(String[] args) {
        try {
            // Connect to the server at localhost on port 5000
            Socket socket = new Socket("localhost", 5000);

            // Output stream to send message to server
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            out.println("Hello from Client!");

            // Input stream to read server reply
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String serverMessage = in.readLine();
            System.out.println("Server says: " + serverMessage);

            // Close the connection
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
