
public class myException extends Exception {
    String id;
    public myException(String str){
        super(str);
        id = str;
    }
    public String toString(){
        return ("error:"+id);
    }
}

class TEstDemo{
    public static void main(String[] args) {
        try {
            throw new myException("error!!!");
        } catch (Throwable e) {
            e = new ArithmeticException("hi~hi");
            System.out.println(e);
        }
    }
}