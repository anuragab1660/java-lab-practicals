import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(12345)) {
            System.out.println("Server started. Waiting for client...");

            // Accept client connection
            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connected.");

            // Create input and output streams
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

            // Read radius from client
            double radius = Double.parseDouble(in.readLine());
            System.out.println("Received radius from client: " + radius);

            // Calculate area of the circle
            double area = Math.PI * radius * radius;

            // Send area back to client
            out.println(area);
            System.out.println("Sent area to client: " + area);

            // Close streams and sockets
            in.close();
            out.close();
            clientSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
