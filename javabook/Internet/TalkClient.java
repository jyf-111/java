
import java.net.*;

import java.io.*;
import java.awt.*;
import java.awt.event.*;

public class TalkClient {
    public static void main(String[] args) throws IOException {
        Socket s1 = new Socket(args[0],5432);
        DataInputStream dis = new DataInputStream(s1.getInputStream());
        final DataOutputStream dos = new DataOutputStream(s1.getOutputStream());
        Frame myframe = new Frame("!!!!!!!!!");
        Panel panelx = new Panel();
        final TextField input = new TextField(20);
        TextArea display =  new TextArea(5,20);
        panelx.add(input);
        panelx.add(display);
        myframe.add(panelx);

        new receiverThread(dis,display);
        input.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    dos.writeUTF(input.getText());
                } catch (IOException z) {
                
                }
            }
        });
        myframe.setSize(300,300);
        myframe.setVisible(true);
    }
}

class receiverThread extends Thread {
    DataInputStream dis;
    TextArea displayarea;

    public receiverThread(DataInputStream dis,TextArea m){
        this.dis = dis;
        displayarea = m;
        this.start();
    }

    public void run() {
        for(;;){
            try{
                String str = dis.readUTF();
                displayarea.append(str+'\n');
            }catch(IOException e){

            }
        }
    }
}
