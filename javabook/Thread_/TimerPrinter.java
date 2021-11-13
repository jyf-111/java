
import java.util.Date;

public class TimerPrinter extends Thread {
    int pauseTime;
    String name;

    public TimerPrinter(int x, String n) {
        pauseTime = x;
        name = n;
    }

    public void run() {
        while (true) {
            try {
                System.out.println(name + ":" + new Date(System.currentTimeMillis()));
                sleep(pauseTime);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        TimerPrinter tp1 = new TimerPrinter(1000, "fast Guy");
        tp1.start();

        TimerPrinter tp2 = new TimerPrinter(3000, "slow Guy");
        tp2.start();
    }
}
