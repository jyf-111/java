
interface A {
    public int add(int a, int b);
}

public class lambda {
    public static void main(String[] args) {
        // lambda
        A a = (x, y) -> x + y;
        A b = new A(){
            public int add(int a,int b){
                return a+b;
            }
        };
        System.out.println(a.add(5,3));
        System.out.println(b.add(5, 3));

        Function<String,String> f = String::toUpperCase;
        System.out.println(f.apply("Java"));
    }
}
