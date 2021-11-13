
import java.awt.*;

class countButton extends Button implements Runnable {
    int count = 0;

    public countButton(String s) {
        super(s);
    }

    @Override
    public void run() {
        while (count <= 10000) {
            try {
                this.setLabel("" + count++);
                Thread.sleep((int) (1000 * Math.random()));
            } catch (Exception e) {

            }
        }
    }

}

public class countFrame extends Frame {
    public countFrame() {
        setLayout(null);
        countButton t1 = new countButton("first");
        t1.setBounds(30, 50, 80, 40);
        add(t1);

        countButton t2 = new countButton("second");
        t2.setBounds(130, 50, 80, 40);
        add(t2);
        (new Thread(t1)).start();

        (new Thread(t2)).start();
    }

    public static void main(String[] args) {
        Frame f = new countFrame();
        f.setSize(250, 150);
        f.setVisible(true);
    }
}
