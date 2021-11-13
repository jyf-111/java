
public class GetFilename {
    private String fullpath;
    private final char pathSeparator = '\\';
    public GetFilename(String fname){
        fullpath = fname;
    }

    public String getname(){
        int pos = fullpath.lastIndexOf(pathSeparator);
        if(pos == -1){
            return fullpath;
        }
        return fullpath.substring(pos+1);
    }

    public String getPath(){
        int pos = fullpath.lastIndexOf(pathSeparator);
        if(pos == -1){
            return null;
        }
        return fullpath.substring(0,pos);
    }

    public static void main(String[] args) {
        GetFilename fn = new GetFilename("D:\\java\\example\\test.java");
        System.out.println("filename = "+fn.getname());
        System.out.println("filepath = "+fn.getPath());
    }
}
