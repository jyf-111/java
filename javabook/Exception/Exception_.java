
public class Exception_ {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
            // System.out.println(a);
            System.out.println(args[0]);
        }
        
        catch (ArithmeticException e) {
            // System.out.println(e.toString());
            e.printStackTrace();
        }
        catch (java.lang.Exception e) {
            e.printStackTrace();
        }finally{
            System.out.println("After calculation");
        }
    }
}
