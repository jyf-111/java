import java.util.Arrays;

public class BubbleSort {
    public void bubble_sort(int[] a) {
        for(int i=0 ;i<a.length-1;i++){
            boolean flag = true;
            for(int j=0 ;j<a.length-1-i;j++){
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    flag = false;
                }
            }
            if(flag) break;
            System.out.println(Arrays.toString(a));

        }
    }
    public static void main(String[] args) {
        int[] a = new int[]{4,3,6,7,4,2,1,6,8,9};

        for(int i=0 ;i<10;i++){
            a[i] = (int)(Math.random()*10);
        }

        new BubbleSort().bubble_sort(a);

        // System.out.println(Arrays.toString(a));
    }
}
