
public class overload {
    // void test(int x){
    //     System.out.println("text(int)"+x);
    // }
    // void test(long x){
    //     System.out.println("test(long)"+x);
    // }
    
    void test(double x){
        System.out.println("test(double)"+x);
    }
    
    public static void main(String[] args) {
        overload A = new overload();
        A.test(5.0);
        A.test(5);
    }
}


