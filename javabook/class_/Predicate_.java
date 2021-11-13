
import java.util.function.*;

public class Predicate_ {
    public static void filter(String[] s,Predicate<String> condition) {
        for(String name:s){
            if(condition.test(name)){
                System.out.println(name + '\t');
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String[] languages = { "Java" ,"basic","fortran"};
        filter(languages, (str)->{return str.startsWith("J");});
        filter(languages, str->str.endsWith("c"));
        filter(languages, str->true);
    }
}
