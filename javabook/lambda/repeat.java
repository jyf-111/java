import java.util.function.IntConsumer;

public class repeat {
    public void repeat(int n,Runnable action){
        for(int i=0 ;i<n;i++){
            action.run();
        }
    }
    public void repeat(int n,IntConsumer action){
        for(int i=0 ;i<n;i++){
            action.accept(i);
        }
    }
    public static void main(String[] args) {
        var r = new repeat();
        r.repeat(10,()->System.out.println("hello"));
        r.repeat(10, (i)->System.out.println("countdown"+i));
    }
    
}
