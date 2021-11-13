
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ContentDemo {
    public static void main(String[] args) {
        JFrame f = new JFrame("Demo");
        Container cont = f.getContentPane();
        cont.setLayout(new FlowLayout());
        for (int i = 1; i < 8; i++) {
            cont.add(new JButton("button#" + i));
        }
        f.setSize(300, 300);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.out.println("closing");
            }
        });
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
