public class Factorial {
    private static Factorial instance;
    private static Long result;
    private Factorial(){}
    public static Factorial getInstance() {
        if(instance==null){
            instance = new Factorial();
        }
        return instance;   
    }
    private long calculate(int n) {
        if(n<=0){
            result = 0L;
            return 0;
        }else{
            long s = 1L;
            for(int i=n;i>0;i--){
                s*=i;
            }
            result = s;
            return s;
        }
    }

    public void getFact(){
        if(result==null){
            System.out.println("0");
        }else{
            System.out.println(result.longValue());
        }
    }

    public static void main(String[] args) {
        Factorial.getInstance().calculate(5);
        Factorial.getInstance().getFact();
    }
}
