import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Client c = new Client();
        c.connection();
        c.sendMessage();
        c.printServerMessage();
    }
}