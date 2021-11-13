
import java.awt.*;
import java.awt.event.*;


public class twoButton extends Panel implements ActionListener {
    Button b1,b2;
    Panel draw;
    public twoButton(Panel draw){
        this.draw = draw;
        b1 = new Button("circle");
        b2 = new Button("rectangle");
        add(b1);
        add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Graphics g =draw.getGraphics();
        g.setColor(draw.getBackground());
        g.fillRect(0,0,draw.getSize().width,draw.getSize().height);
        g.setColor(Color.blue);
        String label = e.getActionCommand();
        if(label.equals("circle")){
            g.drawOval(20, 20, 50, 50);
        }else{
            g.drawRect(20, 20, 40, 60);
        }
    }

    public static void main(String[] args) {
        Frame f = new Frame("twobutton");
        Panel draw = new Panel();
        twoButton two = new twoButton(draw);
        f.setLayout(new BorderLayout());
        f.add("North",two);
        f.add("Center",draw);
        f.setSize(300,300);
        f.setVisible(true);
    }

}
