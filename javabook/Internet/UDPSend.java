
import java.io.*;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPSend {
    public static final String userage= "用法：java UDPSend <hostname> <port> <msg> ... \n"+
    "或 java UDPSend <hostname> <port> -f <file>";

    public static void main(String[] args) {
        try {
            if(args.length<3){
                throw new IllegalArgumentException("参数个数不对");
            }else{
                String host = args[0];
                int port = Integer.parseInt(args[1]);
                byte message[] = null;
                if(args[2].equals("-f")){
                    File f = new File(args[3]);
                    int len = (int)f.length();
                    message = new byte[len];
                    FileInputStream in = new FileInputStream(f);
                    int byte_read = 0;
                    in.read(message,byte_read,len);
                }else{
                    String msg = null;
                    for(int i = 2; i<args.length ;i++){
                        msg+=" "+args[i];
                    }
                    message = msg.getBytes();
                    System.out.println(message);
                }
                
                InetAddress address = InetAddress.getByName(host);
                DatagramPacket packet = new DatagramPacket(message, message.length,address,port);
                System.out.println(message+":"+message.length);               
                DatagramSocket dsocket = new DatagramSocket();
                
                dsocket.send(packet);
                dsocket.close();
            }
        } catch (Exception e) {
            System.out.println(userage);
            System.out.println(e.getMessage());
        }
    }
}
