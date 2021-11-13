
import java.io.File;
import java.io.FilenameFilter;

public class FileFilter_ {
   public static void main(String[] args) {
       File f = new File("E:\\vscode\\java\\javabook\\Stream_");
       String[] s = f.list(new FilenameFilter() {
           @Override
           public boolean accept(File dir,String name){
               return name.endsWith(".java");
           }
       });
       for(String i : s){
           System.out.println(i);
       }
   } 
}
