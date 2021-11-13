
import java.util.*;

public class Map_ {
    public static void main(String[] args) {
        Map<String,String> m = new HashMap();
        m.put("2003011", "张三");
        m.put("2003012", "李四");
        m.put("2003013", "王五");
        Set allEntry = m.entrySet();
        for(Iterator i = allEntry.iterator();i.hasNext();){
            System.out.println(i.next());
        }
        System.out.println(m.get("2003012"));
    }    
}
