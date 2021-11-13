package javabook.Internet;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPReceive {
    static final String usage = "用法: java UDPReceive <port>";

    public static void main(String[] args) {
        try {
            if(args.length!=1){
                throw new IllegalAccessException("参数个数不足");
            }
            int port = Integer.parseInt(args[0]);
            DatagramSocket dSocket = new DatagramSocket(port);
            byte[] buffer = new byte[2048];
            DatagramPacket packet = new DatagramPacket(buffer,buffer.length);
            for(;;){
                dSocket.receive(packet);
                String msg = new String(buffer,0,packet.getLength());
                System.out.println(packet.getAddress().getHostName()+":"+msg);
            }
        } catch (Exception e) {
            System.err.println(usage);
        }
    }
}
