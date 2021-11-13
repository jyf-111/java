
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.*;
import java.util.*;

public class TalkServer {
    public static ArrayList<Client> allclient = new ArrayList<Client>();
    public static int clientnum = 0;

    public static void main(String[] args) {
        try {
            ServerSocket s = new ServerSocket(5432);
            while (true) {
                Socket s1 = s.accept();
                DataOutputStream dos = new DataOutputStream(s1.getOutputStream());
                DataInputStream din = new DataInputStream(s1.getInputStream());
                Client x = new Client(clientnum, dos, din);
                allclient.add(x);
                x.start();
                clientnum++;
            }
        } catch (IOException e) {

        }
    }
}

class Client extends Thread {
    int id;
    DataOutputStream dos;
    DataInputStream din;

    public Client(int clientnum, DataOutputStream dos, DataInputStream din) {
        this.id = clientnum;
        this.dos = dos;
        this.din = din;
    }
    public void run() {
        while(true){
            try {
                String message = "客户" + id + ":" + din.readUTF();
                for(int i = 0 ;i<TalkServer.clientnum;i++){
                    TalkServer.allclient.get(i).dos.writeUTF(message);
                }
            } catch (IOException e) {
                
            }
        }   
    }
}
