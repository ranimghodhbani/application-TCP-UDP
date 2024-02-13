import java.net.*;

public class UDPClient {
    public static void main(String[] args) {
        try {
            DatagramSocket clientSocket = new DatagramSocket();
            InetAddress serverIPAddress = InetAddress.getByName("localhost");
            int serverPort = 9876;
            String message = "Bonjour, serveur!";
            byte[] sendData = message.getBytes();
            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, serverIPAddress, serverPort);
            clientSocket.send(sendPacket);
            clientSocket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
