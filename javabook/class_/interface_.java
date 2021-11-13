
interface Shape{
    // var : public static final
    // method : public abstract
    void draw();
    double area();
    default void show(){
        System.out.println("draw a shape");
    }
    static void s() {
        System.out.println("this is a static method");
    }
}

abstract class Rectangle implements Shape{
    private double x,y,a,b;
    public Rectangle(double x,double y, double a,double b){
        this.x = x;
        this.y = y;
        this.a = a;
        this.b = b;
    }
    public double area(){
        return a*b;
    }
}
public class interface_ {
    public static void main(String[] args) {
        
    }
}
