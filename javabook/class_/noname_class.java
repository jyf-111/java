
interface sample{
    void testMethod();
}
public class noname_class {
    void outerMethod(){
        new sample(){
            public void testMethod(){
                System.out.println("just test!");
            }
        }.testMethod();
    }   
    public static void main(String[] args) {
        noname_class my = new noname_class();
        my.outerMethod();
    }
}
