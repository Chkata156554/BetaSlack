import java.io.BufferedReader;
import java.io.IOException;
import java.net.ServerSocket;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.SocketException;

public class Server {

    private ServerSocket serverSocket;
    private Socket clientSocket;
    private BufferedReader clientInput;
    private PrintWriter output;
    private static final String EXIT_KEYWORD = "exit";

    public void startServer (int port) throws IOException{
        serverSocket = new ServerSocket(port);
        System.out.println("Server pending...");
        clientSocket = serverSocket.accept();
        System.out.println("Client has been connected.");

        clientInput = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

        while(!clientSocket.isClosed()) {
            String receivedMessage = "";

            try {
                receivedMessage = clientInput.readLine();
            } catch(SocketException ex) {
                System.out.println("Client has been disconnected");
                break;
            }

            if(receivedMessage.toLowerCase().equals(EXIT_KEYWORD)) {
                break;
            }

            System.out.println(receivedMessage);
        }

        /**input = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        output = new PrintWriter(clientSocket.getOutputStream(), true);
        output.println("Hello from server");
        System.out.println(input.readLine());




        while(clientSocket.isClosed() && !clientSocket.isInputShutdown()){
        }
        System.out.println("Client has disconnected.");
         input = new BufferedReader(new InputStreamReader(socket.getInputStream()))
         input.readLine();*/
    }
}
