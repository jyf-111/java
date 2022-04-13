import java.util.Arrays;

public class SelectSort {
    public void select_sort(int[] a) {
        for(int i=0 ;i<a.length-1 ;i++){
            int min = a[i];
            int pos = i;
            for(int j = i+1;j<a.length;j++){
                if(a[j]< min){
                    min = a[j];
                    pos = j;
                }
            }
            if(pos != i){
                int temp = a[i];
                a[i] = a[pos];
                a[pos] = temp; 
                System.out.println(Arrays.toString(a));
            }
        }
    }
    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 10);
        }
        new SelectSort().select_sort(a);
    }
}
