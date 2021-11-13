
import java.net.*;
import java.io.*;

public class downloadFile {
    public static void main(String[] args) {
        try {
            URL path = new URL(args[0]);
            saveFile(path);
        } catch (MalformedURLException e) {
            System.out.println("URL error");
        }        
    }

    private static void saveFile(URL url) {
        try {
            URLConnection uc = url.openConnection();
            int len = uc.getContentLength();
            InputStream stream = uc.getInputStream();
            byte b[] = new byte[len];
            stream.read(b,0,len);
            String theFile = url.getFile();
            theFile = theFile.substring(theFile.lastIndexOf('/'+1));
            FileOutputStream fout = new FileOutputStream(theFile);
            fout.write(b);
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
