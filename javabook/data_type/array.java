
import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        int[] a = new int[10];
        
        for(int i = 0;i<a.length;i++){
            a[i] = (int)(Math.random()*10);
        }
        for(int i:a){
            System.out.println(i);
        }

        a = Arrays.copyOf(a, 2*a.length);
        
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        
        int[][] b = new int[4][4];
        // for(int[] i:b){
        //     for(int j:i){
        //         //System.out.println(j);
        //     }
        //     System.out.println(Arrays.toString(i));
        // }

        System.out.println(Arrays.deepToString(b));
    }
}
