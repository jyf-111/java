
import java.awt.event.*;

import java.awt.*;

public class action extends Frame {
    Label dec;
    TextField input;
    public action() {
        super("10 to 2");
        dec = new Label("...answer...");
        input = new TextField(20);
        Button convert = new Button();
        setLayout(new FlowLayout());
        add(input);
        add(convert);
        add(dec);
        convert.addActionListener(new Process());
    }
    class Process implements ActionListener{
        
        @Override
        public void actionPerformed(ActionEvent e) {
            String s = input.getText();
            int result = Integer.parseInt(s);
            dec.setText("result = "+result);
        }
        
    }
    public static void main(String[] args) {
        Frame f = new action();
        f.setSize(400,400);
        f.setVisible(true);
    }
}
