import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.util.*;
import javax.swing.*;


public class MouseComponent extends JComponent{

    public static void main(String[] args) {
        var frame = new JFrame();
        frame.add(new MouseComponent());
        frame.setTitle("this is a action test");
        frame.setSize(400,400);
        frame.setLocationByPlatform(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);   
    }

    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 200;
    private static final int SIDELENGHT = 10;

    private ArrayList<Rectangle2D> squares;
    private Rectangle2D current;

    public MouseComponent(){
        squares = new ArrayList<>();
        current = null;
        
        addMouseListener(new MouseHandler());
        addMouseMotionListener(new MouseMotionHandler());
    }

    public Dimension getPreferredSize(){
        return new Dimension(DEFAULT_WIDTH,DEFAULT_HEIGHT);
    }

    public void paintComponent(Graphics g){
        var g2 = (Graphics2D)g;
        for(Rectangle2D r:squares){
            g2.draw(r);
        }
    }

    public Rectangle2D find(Point2D p){
        for(Rectangle2D r:squares){
            if(r.contains(p)){
                return r;
            }
        }
        return null;
    }

    public void add(Point2D p){
        double x = p.getX();
        double y = p.getY();

        current = new Rectangle2D.Double(x-SIDELENGHT/2,y-SIDELENGHT/2,SIDELENGHT,SIDELENGHT);
        squares.add(current);
        repaint();
    }

    public void remove(Rectangle2D s){
        if(s==null) return ;
        if(s==current) current=null;
        squares.remove(s);
        repaint();
    }

    private class MouseHandler extends MouseAdapter{
        public void mousePressed(MouseEvent event){
            current = find(event.getPoint());
            if(current==null){
                add(event.getPoint());
            }
        }
        public void mouseClicked(MouseEvent event){
            current = find(event.getPoint());
            if(current!=null && event.getClickCount()>=2){
                remove(current);
            }
        }
    }

    private class MouseMotionHandler implements MouseMotionListener {
        public void mouseMoved(MouseEvent event){
            if(find(event.getPoint())==null) setCursor(Cursor.getDefaultCursor());
            else setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
        }
        public void mouseDragged(MouseEvent event){
            if(current!=null){
                int x = event.getX();
                int y = event.getY();

                current.setFrame(x-SIDELENGHT/2,y-SIDELENGHT/2,SIDELENGHT,SIDELENGHT);
                repaint();
            }
        }
    }
}
