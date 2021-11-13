import java.math.BigDecimal;
import java.math.BigInteger;

public class bigInt {
    public static void main(String[] args) {
        BigInteger a = BigInteger.valueOf(100);
        BigInteger b = new BigInteger("2222222222222222222222222222222222222222222");
        System.out.println(b.multiply(a));

        BigDecimal c = BigDecimal.valueOf(2,10);
        System.out.println(c);
    }
}
