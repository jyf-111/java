
import java.util.Arrays;
import java.util.StringTokenizer;

public class WordAnalyse {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("Hello everybody");
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
        String s = "1+2+3+4+5";
        String[] c = s.split("\\+");
        System.out.println(Arrays.toString(c)); 
        // for(String i : c){
        //     System.out.println(i);
        // }
    }    
}
