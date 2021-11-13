
import java.io.*;

public class Fileinfo {
    public static void main(String[] args) throws IOException{
        if(args.length>0){
            for(int i=0 ;i<args.length;i++){
                info(new File(args[i]));
            }
        }else{
                System.out.println("用法:java Fileinfo file1 file2");
        }
    }

    private static void info(File f) {
        System.out.println("Name: "+ f.getName());
        System.out.println("Path: "+ f.getPath());
        System.out.println("Absolute Path: "+f.getAbsolutePath());
        if(f.exists()){
            System.out.println("File exists");
            System.out.println("file is readables: "+f.canRead());
            System.out.println("file is writeables: "+f.canWrite());
            System.out.println("file is"+f.length()+"bytes.");
        }else{
            System.out.println("file is not exist");
        }
    }
}
