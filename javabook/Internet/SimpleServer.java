
import java.net.*;
import java.io.*;

public class SimpleServer {
    public static void main(String[] args) {
        try {
            ServerSocket s = new ServerSocket(5432);
            while(true){
                Socket s1 = s.accept();
                OutputStream s1out = s1.getOutputStream();
                DataOutputStream dos = new DataOutputStream(s1out);
                dos.writeUTF("Hello World!");
                System.out.println("a client is connect...");
                s1.close();
            }
        } catch (IOException e) {
        
        }
    }
}
