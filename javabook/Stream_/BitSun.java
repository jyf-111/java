
import java.io.DataInputStream;
import java.io.IOException;

public class BitSun {
    public static void main(String[] args) throws IOException {
        DataInputStream din = new DataInputStream(System.in);
        System.out.println("put a Integer");
        int x = din.readInt();
        int sum = 0;
        int n = x;
        while (n > 0) {
            int lastbit = n % 10;
            n = n / 10;
            sum += lastbit;
        }
        System.out.println(sum);
    }
}
