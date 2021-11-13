
import java.util.*;

public class List_{
    public static void main(String[] args) {
        HashSet<Object> h = new HashSet<Object>();
        h.add(new Integer(11));
        h.add(new String("hi"));
        h.add("hi");
        h.add(new Double(4.2));
        System.out.println(h);

        ArrayList<String> a = new ArrayList<String>();
        a.add("String1");
        a.add("12");
        a.add("4.2");
        a.add("String1");
        a.add(new String(new String("String1")));
        Iterator p = a.iterator();
        while(p.hasNext()){
            System.out.println(p.next()+",");
        }
        // System.out.println(a);

        LinkedList<String> ll = new LinkedList<>(a);
        System.out.println(ll);


        List<String> mylist = new ArrayList<>();
        for(char i = 'a';i<'g';i++){
            mylist.add(String.valueOf(i));
        }
        Collections.addAll(mylist, "S","12");
        Collections.sort(mylist);
        System.out.println(mylist);
        Collections.sort(mylist,new Comparator1());
        System.out.println(mylist);
    }
}

class Comparator1 implements Comparator<String>{
    public int compare(String s1,String s2){
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        return s1.compareTo(s2);
    }
}