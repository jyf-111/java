
import java.util.Arrays;
import java.util.Comparator;

public class return_lambda {
    public static Comparator<String> compareMy(int direction){
        return (x,y)->direction*x.compareTo(y);
    }
    public static void main(String[] args) {
        String[] x = {"w123","43","4343","5345"};
        Arrays.sort(x,compareMy(-1));
        System.out.println(Arrays.toString(x));
        Arrays.sort(x,compareMy(1));
        System.out.println(Arrays.toString(x));   
    }    
}
