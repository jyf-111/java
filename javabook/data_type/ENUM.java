
import java.util.Arrays;

enum Size{
    SMALL("S"),MEDIUM("M"),LARGE("L");
    private String abbreviation;
    private Size(String abbreviation){
        this.abbreviation = abbreviation;
    }
    public String get(){
        return abbreviation;
    }
}

public class ENUM {
    public static void main(String[] args) {
        Size s = Enum.valueOf(Size.class,"SMALL");
        System.out.println(s.ordinal());
        Size[] x = Size.values();
        System.out.println(Arrays.toString(x));
    }    
}
