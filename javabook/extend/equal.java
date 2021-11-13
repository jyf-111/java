
import java.util.Objects;

public class equal {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();
        System.out.println(a1.equals(a2));

        B b = new B();
        System.out.println(b instanceof A);
    }
}

class A{
    public String id = "1";
    public int age = 20;
    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj == null){
            return false;
        }
        if(getClass()!=obj.getClass()){
            return false;
        }
        
        var a = (A)obj;
        return id.equals(a.id) && age == a.age;
    }
}

class B extends A{
    String name = "jyf";
    @Override
    public boolean equals(Object obj) {
        if(!super.equals(obj)) return false;
        var a = (A)obj;
        return obj instanceof A && Objects.equals(id, a.id);
    }
}