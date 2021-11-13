import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class comp {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        a.add("cc");
        a.add("q");
        a.add("ffff");
        String [] people = (String[])a.toArray(new String[a.size()]);
        System.out.println(Arrays.toString(people));
        // a.sort((s,t)->(s.length()-t.length()));
        // Arrays.sort(people,Comparator.comparing(String::length).thenComparing((s,t)->s.length()-t.length()));
        // Arrays.sort(people,Comparator.comparingInt(p->p.length()));
        Arrays.sort(people,Comparator.comparing(String::length,Comparator.nullsFirst(Comparator.naturalOrder())));
        System.out.println(Arrays.toString(people));
    }    
}
