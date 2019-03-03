package sandbox;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.ServerSocket;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.List;

public class Server {

   /** private ServerSocket serverSocket;
    private List<Socket> connectedClients = new ArrayList<Socket>();
    private boolean online;
    private Thread acceptingThread;

    public void startServer (int port) throws IOException{
        serverSocket = new ServerSocket(port);
        System.out.println("Server pending...");
        online = true;

        acceptingThread = new Thread(() -> {
            while (online) {
                Socket clientSocket = null;
                try{
                    clientSocket = serverSocket.accept();
                } catch (IOException e){
                    online = false;
                    System.out.println("Server has been disconnected.");
                    break;
                }
                connectedClients.add(clientSocket);
                System.out.println("Client has been connected." + "Users online: " + connectedClients.size());
            }
        });
        acceptingThread.start();
    }

    public void shutdown(){
        online = false;

    }

    public boolean isOnline(){
        return online;
    }*/

}
