package socket_prog_java;
import java.net.ServerSocket;
import java.net.Socket;
public class EchoServer {
    public static void main(String[] args) {
        try {
            System.out.println("Waiting for clients.....");
            ServerSocket ss = new ServerSocket(9806);
            Socket soc = ss.accept();
            System.out.println("Client connected: " + soc.getInetAddress().getHostAddress());
            System.out.println("Connection established");
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }

    }
}