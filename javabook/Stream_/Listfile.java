
import java.io.File;

public class Listfile {
    public static void main(String[] args) {
        File f = new File("E:/");
        File[] c = f.listFiles();
        for(File x :c){
            System.out.println(x);
        }
    }    
}
