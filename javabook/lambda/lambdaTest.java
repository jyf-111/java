
import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;
import java.util.Objects;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class lambdaTest {
    public static void main(String[] args) {
        var planets = new String[] {"Mercury","Venus","Earth","Mars",
                                    "Jupiter","Saturn","Uranus","Neptune"};
        System.out.println(Arrays.toString(planets));

        System.out.println("Sort : ");
        Arrays.sort(planets);
        Arrays.sort(planets,String::compareToIgnoreCase);
        System.out.println(Arrays.toString(planets));

        System.out.println("Sort by lenth");
        Arrays.sort(planets,(first,second)->first.length()-second.length());
        System.out.println(Arrays.toString(planets));

        LocalDate day = LocalDate.now();
        LocalDate hireDay = Objects.requireNonNullElseGet(day, ()->LocalDate.now());//延迟构造

        var Timer = new Timer(1000,event->System.out.println("the time is "+new Date()));
        Timer.start();

        var timer = new Timer(1000, System.out::println);
        timer.start();

        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}
