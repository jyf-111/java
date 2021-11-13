
import java.io.*;

public class raTest {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(
            new InputStreamReader(System.in)
        );
        String s = in.readLine();
        RandomAccessFile myRAFile = new RandomAccessFile("javabook/Stream_/java.log", "rw");
        myRAFile.seek(myRAFile.length());
        myRAFile.writeBytes(s+'\n');
        myRAFile.close();
    }    
}
