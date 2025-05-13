import java.io.*;
import java.net.*;

public class SimpleServer {
    public static void main(String[] args) {
        try {
            // Create a server socket on port 5000
            ServerSocket serverSocket = new ServerSocket(5000);
            System.out.println("Server is waiting for a client...");

            // Accept the client connection
            Socket socket = serverSocket.accept();
            System.out.println("Client connected!");

            // Input stream to receive message from client
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String clientMessage = in.readLine();
            System.out.println("Client says: " + clientMessage);

            // Output stream to send reply to client
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            out.println("Hello from Server!");

            // Close connections
            socket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
    

