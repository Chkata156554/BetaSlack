import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {

    private Socket socket;
    private PrintWriter output;
    private BufferedReader input;
    public void connectToServer (String ipAddress, int port) throws IOException {
        socket = new Socket(ipAddress, port);
        input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        output = new PrintWriter(socket.getOutputStream(), true);
        output.println("Hello from client");
        System.out.println(input.readLine());
    }
}
