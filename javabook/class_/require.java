
import java.util.Objects;


public class require {
    private String a;
    private String b;
    private final String name = "jyf";
    public require(String _a,String b){
        a = Objects.requireNonNullElse(_a,"unknow");
        Objects.requireNonNull(b,"error");//断言喽
        this.b = b;
    }
    @Override
    public String toString(){
        return a+b;
    }

    public static void main(String[] args) {
        require r = new require(null, "hih");
        System.out.println(r);
    }
}
