import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;
public class _Stream_ {
    public static void main(String[] args) {
        //创建流对象
        List<String> str = Arrays.asList("bird","word","boy","book","work");
        Stream<String> strStream = str.stream();

        Stream<String> stream = Stream.of("a","b","c");

        Stream<Integer> integerstream = Stream.of(1,2,3);
        // IntStream itstream  = integerstream.mapToInt(java.lang.Integer::parseInt);

        int []arr = {1,2,3,4,5,6,7,8};
        IntStream stream_ = Arrays.stream(arr);

        //中间操作
        // strStream.filter((s)->s.startsWith("w")).forEach(System.out::printf);
        
        // strStream.map(String::toUpperCase).forEach(System.out::println);
        
        // strStream.map((s)->s.substring(0,1)).distinct().forEach(System.out::printf);
        
        // strStream.sorted().forEach(System.out::println);

        //最终操作
        // boolean r1 = strStream.anyMatch((s)->s.startsWith("w"));
        // System.out.println(r1);

        // long x1 = strStream.filter((s)->s.startsWith("b")).count();
        // System.out.println(x1);

        biggest(10,2,3,4,4,5,5,6,3,6,6);
        List<String> l = strStream.toList();
        System.out.println(l);
    }
    
    public static void biggest(Integer... numbers) {
        List<Integer> x = Arrays.asList(numbers);
        Optional<Integer> c = x.stream().max(Integer::compareTo);
        System.out.println("result is :"+c);
        System.out.println(c.get());
    //reduce操作         
        System.out.println(x.stream().reduce((z,y)->z+y).get());
    }
}