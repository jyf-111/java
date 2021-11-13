import java.util.Arrays;

public class InsertSort {
    public void insert_sort(int[] a) {
        for (int i = 1; i < a.length ; i++) {
            int temp = a[i];
            int j = i;
            while (j > 0 && temp < a[j - 1]) {
                a[j] = a[j-1];
                j--;
            }
            a[j] = temp;
            System.out.println(Arrays.toString(a));
        }
    }

    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 10);
        }
        new InsertSort().insert_sort(a);
    }
}
