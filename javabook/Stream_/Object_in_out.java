
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class Object_in_out {
    public void WriteData() {
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("javabook/Stream_/storedata.dat"));
            out.writeObject(new Date());
            out.writeObject("hello world!");
            System.out.print("写入完毕");
        } catch (IOException e) {
        
        }
    }

    public void ReadDate(){
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("javabook/Stream_/storedata.dat"));
            Date current = (Date)in.readObject();
            System.out.println("日期："+current);
            String str = (String)in.readObject();
            System.out.println("字符串"+str);
        } catch (IOException e) {

        }catch (ClassNotFoundException e){

        }
    }
    public static void main(String[] args) {
        Object_in_out ob = new Object_in_out();
        ob.WriteData();
        ob.ReadDate();
    }
}
