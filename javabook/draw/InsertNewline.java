
import java.awt.*;
import java.awt.event.*;

public class InsertNewline extends Frame implements ActionListener {
    TextField input;
    TextArea display;
    final static int lineSize = 20;

    public InsertNewline(){
        input = new TextField(45);
        display = new TextArea(10,45);
        add(input);
        add(display);
        input.addActionListener(this);
    };

    @Override
    public void actionPerformed(ActionEvent e) {
       String s = input.getText();
       String r = convert(s);
       display.setText(r); 
    }

    private String convert(String s) {
        String result = "";
        int count = 0;
        for(int i=0;i<s.length();i++){
            int c = s.charAt(i);
            if(c>=32 && c<=126){
                count++;
            }else{
                count+=2;
            }
            result+=(char)c;
            if(count>=lineSize){
                result+='\n';
                count = 0;
            }
        }
        return result;
        
    }
    
    public static void main(String[] args) {
        Frame f = new InsertNewline();
        f.setTitle("hi~hi");
        f.setLayout(new FlowLayout());
        f.setSize(800,400);
        f.setVisible(true);
    }
}
