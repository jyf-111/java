package SimpleFactory;

public class Client {
    public static void main(String[] args) {
        Product product;
        product = Factory.getProduct("A");
        product.methodSame();
        product.methodDiff();
    }
}
