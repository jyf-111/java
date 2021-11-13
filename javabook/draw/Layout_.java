
import java.awt.*;

import java.awt.event.*;


public class Layout_ extends Frame {
    public Layout_(String str) {
        super(str);
        // this.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
        // String space = "";
        // for (int i = 0; i < 10; i++) {
        //     this.add(new Button("B # " + i + space));
        //     space += " ";
        // }

        // this.setLayout(new BorderLayout(10,10));
        // String border[]={"North","East","South","West","Center"};
        // for(int i=0 ;i<5;i++){
        //     this.add(border[i],new Button(border[i]));
        // }

        // this.setLayout(new GridLayout(3,3,10,10));
        // for(int i= 0;i<9;i++){
        //     this.add(new Button("Button # "+i));
        // }

        final CardLayout cardLayout = new CardLayout(10,10);
        this.setLayout(cardLayout);
        ActionListener listener = new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                cardLayout.next(Layout_.this);
            }
        };
        for(int i=0;i<10;i++){
            Button b = new Button("Button # "+i);
            b.addActionListener(listener);
            this.add(b);
        }
    }
    public static void main(String[] args) {
        Frame f = new Layout_("hi~hi");

        f.setSize(200,120);
        f.setVisible(true);
    }
}
