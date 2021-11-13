
import java.io.*;
import java.net.*;

public class GetURL {
    public static void main(String[] args) {
        InputStream in = null;
        OutputStream out = null;
        try{
            if((args.length!=1)&&(args.length!=2)){
                throw new IllegalArgumentException("参数个数不对");
            }
            URL url = new URL(args[0]);
            in = url.openStream();
            if(args.length==2){
                out = new FileOutputStream(args[1]);
            }else{
                out = System.out;
                byte[] buffer = new byte[4096];
                int byte_read;
                while((byte_read = in.read(buffer))!=-1){
                    out.write(buffer,0,byte_read);        
                }
            }
        }catch(Exception e){
            System.err.println("Usage: java GetURl <URl> [<filename>]");
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
    }    
}
