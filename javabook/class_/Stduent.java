
public class Stduent extends Person {
    String no;

    public Stduent(String name1, String address1, int age1, String no1) {
        super(name1, address1, age1);
        no = no1;
    }

    public static void main(String[] args) {
        Stduent x = new Stduent("张三", "江西", 25, "20012541");
        System.out.println("name = " + x.getName());
        System.out.println("no = " + x.no);
    }
}
