
import java.io.*;

public class DisplayFile {
    public static void main(String[] args) throws IOException {
        try {
            FileInputStream infile = new FileInputStream("javabook/Stream_/File.txt");
            int byteRead = infile.read();
            while(byteRead!=-1){
                System.out.println((char)byteRead);
                byteRead = infile.read();
            }
            infile.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }  
    }    
}
