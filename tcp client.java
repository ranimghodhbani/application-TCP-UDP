import java.io.*;
import java.net.*;

public class TCPClient {
    public static void main(String[] args) {
        try {
            Socket clientSocket = new Socket("localhost", 12345);
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

            String message = "Bonjour, serveur!";
            out.println(message);

            clientSocket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
