
import java.io.Console;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Scanner;

public class Scanner_ {
    public static void main(String[] args) throws IOException {
        // Scanner in = new Scanner(System.in);
        // String name = in.nextLine();
        // System.out.println(name);
        // System.out.println(in.next());
        // System.out.println(in.nextInt());
        // System.out.println(in.nextDouble());
        // Console cons = System.console();
        // String username = cons.readLine("user name:");
        // char[] passwd = cons.readPassword("Passwd:");

        // double x = -10000.0/3;
        // System.out.printf("%,(8.2f\n",x);

        // String message = String.format("hello, %s . new year age %d", "jyf",20).format("hi");
        // System.out.println(message);

        PrintWriter out = new PrintWriter("javabook/IO/myfile.txt",StandardCharsets.UTF_8);
        out.write("111");
        out.write(" 222");
        out.write(" 333");
        out.close();
        Scanner in = new Scanner(Path.of("javabook/IO/myfile.txt"),StandardCharsets.UTF_8);
        while(in.hasNext())
            System.out.println(in.next());
        in.close();

        System.out.println(System.getProperty("user.dir"));
    }
}
