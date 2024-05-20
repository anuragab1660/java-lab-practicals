import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 12345)) {
            // Create input and output streams
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            // Send radius to server
            double radius = 5.0; // Example radius
            out.println(radius);
            System.out.println("Sent radius to server: " + radius);

            // Receive area from server
            double area = Double.parseDouble(in.readLine());
            System.out.println("Received area from server: " + area);

            // Close streams and socket
            in.close();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
