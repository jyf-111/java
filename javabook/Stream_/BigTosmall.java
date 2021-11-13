
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BigTosmall {
    public static void main(String[] args) {
        int number = 0;
        final int size = Integer.parseInt("11");
        byte[] b = new byte[size];
        try {
            FileInputStream infile = new FileInputStream("javabook/Stream_/File.txt");
            while(true){
                FileOutputStream outFile = new FileOutputStream("javabook/Stream_/file"+number+".txt");
                number++;
                int byteRead = infile.read();
                if(byteRead==-1){
                    break;
                }
                b[0] = (byte)byteRead;
                outFile.write(b,0,1);
                System.out.println();
                
                outFile.close();
            }
            infile.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
