
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ClickableDice extends JFrame {
    int value1 = 4;
    int value2 = 4;
    MyPanel dice;

    public ClickableDice() {
        dice = new MyPanel();
        dice.setBackground(Color.pink);
        dice.setBorder(BorderFactory.createTitledBorder("投掷骰子面板"));
        setContentPane(dice);
        dice.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                value1 = (int) (Math.random() * 6) + 1;
                value2 = (int) (Math.random() * 6) + 1;
                dice.repaint();
            }
        });
        setSize(300, 200);
        setVisible(true);
    }

    void draw(Graphics g, int val, int x, int y) {
        g.setColor(Color.white);
        g.fillRect(x, y, 35, 35);
        g.setColor(Color.black);
        g.drawRect(x, y, 34, 34);
        if (val > 1) {
            g.fillOval(x + 3, y + 3, 9, 9);
            g.fillOval(x + 23, y + 23, 9, 9);
        }
        if (val > 3) {
            g.fillOval(x + 23, y + 3, 9, 9);
            g.fillOval(x + 3, y + 23, 9, 9);
        }
        if (val == 6) {
            g.fillOval(x + 3, y + 13, 9, 9);
            g.fillOval(x + 23, y + 13, 9, 9);
        }
        if (val % 2 == 1) {
            g.fillOval(x + 13, y + 13, 9, 9);
        }
    }

    class MyPanel extends JPanel {
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            draw(g, value1, 40, 40);
            draw(g, value2, 120, 40);
        }
    }
    public static void main(String[] args) {
        new ClickableDice();
    }
}