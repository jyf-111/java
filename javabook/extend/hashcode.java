
import java.util.Objects;

public class hashcode {
    public static void main(String[] args) {
        C a = new C();
        D b = new D();
        C c = a;
        System.out.println("a= "+a.hashCode());
        System.out.println("b= "+b.hashCode());
        System.out.println("c= "+c.hashCode());
    }
}


class C {
    int a;
    int b;
    int c;
    public int hashcode() {
        return 7*Objects.hashCode(a)
                + 11*Objects.hashCode(b)
                + 13*Objects.hashCode(c); 
    }
}

class D extends C{
    public int hashCode(){
        return Objects.hash(a,b,c);
    }
}
