
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class AddLineNo {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("javabook/Stream_/AddLineNo.java");
            LineNumberReader in = new LineNumberReader(file);
            boolean eof = false;
            while(!eof){
                String x  = in.readLine();
                if(x==null){
                    eof = true;
                }else{
                    System.out.println(in.getLineNumber()+":"+x);
                }
            }
            in.close();
        } catch (IOException e) {
        
        }
    }
}
