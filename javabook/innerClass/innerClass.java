import java.time.*;
import javax.swing.*;

public class innerClass {
    public static void main(String[] args) {
        var clock = new innerClass().new TalkingClock(1000, true);
        clock.start();
        JOptionPane.showMessageDialog(null, "quit?");
        System.exit(0);
    }

    class TalkingClock {
        private int interval;
        private boolean beep;

        public TalkingClock(int interval, boolean beep) {
            this.interval = interval;
            this.setBeep(beep);
        }

        public boolean isBeep() {
            return beep;
        }

        public void setBeep(boolean beep) {
            this.beep = beep;
        }

        public void start() {
            //局部内部类不能有访问控制符,作用域仅限函数范围
            // class TimerPrinter implements ActionListener{
            //     public void actionPerformed(ActionEvent event) {
            //         System.out.println("At the tone, the time is "
            //         +Instant.ofEpochMilli(event.getWhen()));
            //         if(beep) Toolkit.getDefaultToolkit().beep();
            //     }           
            // }

            // 匿名内部类
            // var listener = new ActionListener(){
            //     @Override
            //     public void actionPerformed(ActionEvent event) {
            //         System.out.println("At the tone, the time is "
            //         +Instant.ofEpochMilli(event.getWhen()));
            //     }
            // };

            // var listener = new TimerPrinter();

            //lambda
            var timer = new Timer(interval,event->{
                System.out.println(Instant.ofEpochMilli(event.getWhen()));
            });
            timer.start();
        }

        // //内部类
        // public class TimerPrinter implements ActionListener{
        // public void actionPerformed(ActionEvent event) {
        // System.out.println("At the tone, the time is "
        // +Instant.ofEpochMilli(event.getWhen()));
        // if(beep) Toolkit.getDefaultToolkit().beep();
        // }
        // }
    }
}
