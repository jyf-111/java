package javabook.draw;import java.awt. * ;
import java.awt.event.*;

public class AWP_ extends Panel implements ActionListener{
    Label dec;
    TextField input;

    public AWP_() {
        // super("binary to decimal");
        dec = new Label("...answer...");
        input = new TextField(15);
        Button convert = new Button("convert");
        setLayout(new FlowLayout());
        add(input);
        add(convert);
        add(dec);
        convert.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
       String s = input.getText();
       int x = Integer.parseInt(s,2);
       dec.setText("result = " + x); 
    }
    public static void main(String[] args) {
        Frame x = new Frame("hihi");
        x.add(new AWP_());
        x.setSize(400,100);
        x.setVisible(true);
    }
}
