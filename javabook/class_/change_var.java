
public class change_var {
    static void output(String... args){
        for(int i=0 ;i<args.length;i++){
            System.out.println(args[i]);
        }
    }    
    public static void main(String[] args) {
        String[] s = {"你好","我好","大家好"};
        output(s);
    }
}
