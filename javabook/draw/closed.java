import java.awt.*;
import java.awt.event.*;

public class closed extends Frame implements ActionListener {

    public closed(){
        Button btn = new Button("close");
        setLayout(new FlowLayout());
        add(btn);
        btn.addActionListener(this);
        addWindowListener(new closeWin());
        setSize(300,200);
        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getActionCommand()=="close"){
           dispose();
       } 
    }

    public static void main(String[] args) {
        Frame f = new closed();
        f.setSize(200,150);
        f.setVisible(true);
    }
    
}

class closeWin extends WindowAdapter {
    public void windowClosing(WindowEvent e) {
        Window w = e.getWindow();
        w.dispose();
    }
}
