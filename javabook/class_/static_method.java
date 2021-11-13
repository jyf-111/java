
public class static_method {
    // static方法中只能访问static方法变量
    public static boolean prime(int n) {
        for (int k = 2; k <= Math.sqrt(n); k++) {
            if (n % k == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        for (int m = 10; m <= 100; m++) {
            if(prime(m)){
                System.out.print(m+",");
            }
        }
    }
}
