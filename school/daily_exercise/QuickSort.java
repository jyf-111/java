import java.util.Arrays;

public class QuickSort {
    public void quick_sort(int[] a,int start,int last) {
        
        if(start >= last) return;

        int low = start;
        int high = last;
        int k = a[low];
        while(low < high){
            while(low < high && k <= a[high]){
                high--;
            }
            a[low] = a[high];
            while(low < high && k>=a[low]){
                low++;
            }
            a[high] = a[low];
        }      
        a[low] = k;
        quick_sort(a, start, low-1);
        quick_sort(a, low+1, last);
    }

    public static void main(String[] args) {
        int[] a = new int[]{3,2,1,4,5,9,7,8,3};
        // for(int i=0 ;i<a.length;i++){
        //     a[i] = (int)(Math.random()*10);
        // }
        
        System.out.println(Arrays.toString(a));
        new QuickSort().quick_sort(a, 0, a.length-1);
        System.out.println(Arrays.toString(a));
    }
}
