package socket_prog_java;
import java.net.Socket;
public class EchoClient {
    public static void main(String[] args) {
        try {
            System.out.println("Connecting to server...");
            Socket socket = new Socket("localhost", 9806);
            System.out.println("Connected to server: " + socket.getInetAddress().getHostAddress());
            System.out.println("Connection established");
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
}
