
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

public class OutSisterPrime {
    public static void main(String[] args) throws IOException {
        FileInputStream file = new FileInputStream("javabook/Stream_/File.txt");
        DataInputStream in = new DataInputStream(file);
        try {
            while(true){
                int n1 = in.readInt();
                int n2 = in.readInt();
                System.out.println(n1+","+n2);
            }
        } catch (EOFException e) {
            in.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    } 
}
