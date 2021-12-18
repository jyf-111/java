import java.awt.*;
import javax.swing.*;
public class NotHelloWorld {
    public static void main(String[] args) {
        EventQueue.invokeLater(()->{
            var frame = new NotHelloWorldFrame();
            frame.setTitle("NotHelloWorld");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}

/**
 * NotHelloWorldFrame
 */ 
class NotHelloWorldFrame extends JFrame{
    public NotHelloWorldFrame(){
        add(new NotHelloWorldComponent());
        pack();
    }
}

/**
 * NotHelloWorldComponent extends JComponent
 */
class NotHelloWorldComponent extends JComponent {
    public void paintComponent(Graphics g){
        g.drawString("Not a Hello, World program", 75 ,100); 
    }    
    public Dimension getPreferredSize(){
        return new Dimension(300,200);
    }
}