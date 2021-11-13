import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;
public class Greeter {
    public void greet(ActionEvent event) {
        System.out.println("Hello,the time is"+new Date());
    }    
}

class RepeatedGreeter extends Greeter {
    public void greet(ActionEvent event) {
        var timer = new Timer(1000,super::greet);
        timer.start();
    }
    public static void main(String[] args) {
        RepeatedGreeter r = new RepeatedGreeter();
        // r.greet(new ActionEvent());
    }
}