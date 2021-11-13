
import jdk.jshell.spi.ExecutionControl.RunException;

public class ex_method {
    public void name() throws RuntimeException,RunException{
        System.out.println("hi~hi");
    }
    public static void main(String[] args) {
        ex_method e = new ex_method();
        try {
            e.name();
        } catch (RunException | RuntimeException e1) {
            e1.printStackTrace();
        }
    }
}
