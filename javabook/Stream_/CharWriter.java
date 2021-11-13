
import java.io.FileWriter;

public class CharWriter {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("javabook/Stream_/charset.dat");
            for(int i=32;i<126;i++){
                fw.write(i);
            }
            fw.close();
        } catch (Exception e) {
            
        }
    }    
}
