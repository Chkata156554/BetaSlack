import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Client client = new Client();
        client.connectToServer("192.168.1.74",55555);
    }
}
