
import java.util.function.*;

public class Function_ {
    public static void main(String[] args) {
        Function<String,String> f = (x) ->{
            return x.substring(0,1).toUpperCase()+x.substring(1);
        };
        System.out.println(f.apply("Java"));
        Predicate<Integer> pre = (x)->{
            for(int k =2;k<x-1;k++){
                if(x%k==0){
                    return false;
                }
            }
            return true;
        };
        System.out.println(pre.test(100));
    }
}
