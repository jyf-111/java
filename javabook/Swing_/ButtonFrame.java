import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 * ButtonFrame
 */
public class ButtonFrame extends JFrame{
    private JPanel buttonPanel;
    public ButtonFrame(){
        setSize(300,200);

        var yellowButton = new JButton("Yellow");
        var blueButton = new JButton("Blue");
        var redButton = new JButton("Red");

        buttonPanel = new JPanel();
        buttonPanel.add(yellowButton);
        buttonPanel.add(blueButton);
        buttonPanel.add(redButton);
        add(buttonPanel);

        var yellowAction = new ColorAction(Color.YELLOW);
        var blueAction = new ColorAction(Color.BLUE);
        var redAction = new ColorAction(Color.RED);

        yellowButton.addActionListener(yellowAction);
        blueButton.addActionListener(blueAction);
        redButton.addActionListener(redAction);

    }
    private class ColorAction implements ActionListener {
        private Color backgroundColor;
        public ColorAction(Color c){
            backgroundColor = c;
        }
        public void actionPerformed(ActionEvent event){
            buttonPanel.setBackground(backgroundColor);
        }
        
    }

    public static void main(String[] args) {
        var frame = new ButtonFrame();
        frame.setTitle("this is a button test");
        frame.setLocationByPlatform(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}