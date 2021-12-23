import java.util.function.IntConsumer;

public class Greeter {
    private static void greet(int cols) {
        for(int i=0 ;i<cols;i++){
            System.out.print("*");
        }        
        System.out.println();
    }
    private static void greet(int cols,String words) {
        System.out.print("*");
        int space = (cols-words.length()-2)/2;
        for(int i=0 ;i<space;i++){
            System.out.print(" ");
        }
        System.out.print(words);
        for(int i=0 ;i<space;i++){
            System.out.print(" ");
        }
        System.out.print("*\n");
    }
    public void greet(){
        StringBuilder sb = new StringBuilder();
        sb.append("*******************************\n");
        sb.append("*                             *\n");
        sb.append("*       Welcome to Java       *\n");
        sb.append("*                             *\n");
        sb.append("* Nanjing Forestry University *\n");
        sb.append("*                             *\n");
        sb.append("*******************************\n");
        System.out.println(sb.toString());
    }
    public static void main(String[] args) {
        Greeter g = new Greeter();

        Greeter.greet(31);
        System.out.println("*                             *");
        Greeter.greet(31, "Welcome to Java");
        System.out.println("*                             *");
        Greeter.greet(31, "Nanjing Forestry University");
        System.out.println("*                             *");
        Greeter.greet(31);

        System.out.println();
        System.out.println();

        g.greet();
    }
}
