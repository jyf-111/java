import javax.swing.JFrame;

import java.awt.*;
import java.awt.event.*;

public class MainFrame extends JFrame{
    private MainPanel panel;
    MainFrame(){
        super("Explore");
        create();
    }
    private void create(){
        this.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
                panel.onFinish();
                System.exit(0);
            }
        });
        this.panel = new MainPanel();
        this.getContentPane().add(this.panel,BorderLayout.CENTER);

        this.setPreferredSize(new Dimension(800,600));
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
