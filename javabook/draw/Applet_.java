
import java.applet.Applet;
import java.awt.*;

public class Applet_ extends Applet {
    static int initCount = 0;
    static int startCount = 0;
    static int paintCount = 0;
    static int stopCount = 0;

    public void init() {
        initCount++;
    }

    public void start() {
        startCount++;
    }

    public void stop() {
        stopCount++;
    }

    public void paint(Graphics g) {
        paintCount++;
        g.drawString("init()=" + initCount, 50, 30);
        g.drawString("start()=" + startCount, 100, 30);
        g.drawString("paint()=" + paintCount, 150, 30);
        g.drawString("stop() = ", 200, 30);
    }
}
