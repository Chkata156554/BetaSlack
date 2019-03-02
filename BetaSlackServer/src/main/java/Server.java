import java.io.BufferedReader;
import java.io.IOException;
import java.net.ServerSocket;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Server {

    private ServerSocket serverSocket;
    private Socket clientSocket;
    private BufferedReader input;
    private PrintWriter output;

    public void startServer (int port) throws IOException{
        serverSocket = new ServerSocket(port);
        System.out.println("Server pending...");
        clientSocket = serverSocket.accept();
        System.out.println("Client has been connected.");
        input = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        output = new PrintWriter(clientSocket.getOutputStream(), true);
        output.println("Hello from server");
        System.out.println(input.readLine());




        /**while(clientSocket.isClosed() && !clientSocket.isInputShutdown()){
        }
        System.out.println("Client has disconnected.");
         input = new BufferedReader(new InputStreamReader(socket.getInputStream()))
         input.readLine();*/
    }
}
