import java.awt.*;
import java.awt.event.*;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;         
public class Talk extends Frame implements Runnable{
    MulticastSocket mSocket;
    TextArea display;
    TextField input;

    public Talk(){
        super("多播测试");
        try {
            mSocket = new MulticastSocket(7777);
            InetAddress inetAddress = InetAddress.getByName("230.0.0.1");
            mSocket.joinGroup(inetAddress);
        } catch (Exception e) { }
        display = new TextArea(5,40);
        input = new TextField(20);
        add("South",input);
        add("Center",display);
        setSize(200,400);
        setVisible(true);
        input.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                try {
                    byte[] data = input.getText().getBytes();
                    input.setText("");
                    InetAddress inetAddress = InetAddress.getByName("230.0.0.1");
                    DatagramPacket datagramPacket = new DatagramPacket(data,data.length,inetAddress,7777);
                    mSocket.send(datagramPacket);
                } catch (Exception e1) {
                
                }
            }
        });
    }

    @Override
    public void run() {
        try {
            while (true) {
                byte[] data = new byte[200];
                DatagramPacket datagramPacket = new DatagramPacket(data,data.length);
                mSocket.receive(datagramPacket);
                display.append(new String(data));
                display.append("\n");
            }
        } catch (Exception e) {
        
        } 
    }
    public static void main(String[] args) {
        Talk s = new Talk();
        new Thread(s).start();
    }
}
