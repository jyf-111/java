
import java.io.*;

public class Count {
    public static void main(String[] args) throws IOException {
        int count;
        RandomAccessFile fio = new RandomAccessFile("javabook/Stream_/count.txt", "rw");
        if(fio.length()==0){
            count = 1;
        }else{
            fio.seek(0);
            count = fio.readInt();
            count = count + 1;
        }
        fio.seek(0);
        fio.writeByte(count);
        fio.close();
    }
}
