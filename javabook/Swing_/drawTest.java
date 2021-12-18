import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;

public class drawTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(()->{
            var frame = new DrawFrame();
            frame.setTitle("draw test");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }    
}

/**
* DrawFrame extends JFrame
 */
class DrawFrame extends JFrame {
    public DrawFrame(){
        var component = new DrawComponent();
        component.setBackground(Color.red);//???
        add(component);
        setLocationByPlatform(true);
        pack();
    }
}

/**
 * DrawComponent extends JComponent
 */ 
class DrawComponent extends JComponent {
    public void paintComponent(Graphics g) {
        var g2 = (Graphics2D)g;

        var rect = new Rectangle2D.Double(100,100,200,150);
        g2.draw(rect);

        var ellipse = new Ellipse2D.Double();
        ellipse.setFrame(rect);
        g2.draw(ellipse);

        g2.draw(new Line2D.Double(100,200,300,250));

        var circle = new Ellipse2D.Double();
        circle.setFrameFromCenter(rect.getCenterX(),rect.getCenterY(),rect.getCenterX()+150,rect.getCenterX()+150);
        g2.draw(circle);
    }
    public java.awt.Dimension getPreferredSize(){
        return new Dimension(400,400);
    }
}