import java.awt.Toolkit;

public class hi {
    public static void main(String[] args) throws Throwable{
        System.out.println("你好");
        for(int i=0 ;i<10;i++){
            Toolkit.getDefaultToolkit().beep();
            Thread.sleep(250);
        }
    }    
}
