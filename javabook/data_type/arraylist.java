
import java.util.ArrayList;
import java.util.Arrays;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> staff = new ArrayList<>(2);//确定大小
        var employee = new ArrayList<Integer>(2);

        System.out.println(staff.size());//实际大小

        staff.ensureCapacity(5);//确定容量

        
        staff.add(Integer.valueOf(1));
        staff.add(Integer.valueOf(2));
        
        staff.set(1, 5);
        System.out.println(staff.get(1));

        staff.trimToSize();//垃圾回收

        var a = new Integer[staff.size()];
        staff.toArray(a);
        System.out.println(staff);
        System.out.println(Arrays.toString(a));
    }
}
