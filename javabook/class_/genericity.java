//泛型
public class genericity<T> {
    private T obj;

    public genericity(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }
// 泛型方法
    public <K> void showType(K s) {
        System.out.println(s+"T的实际类型： " + obj.getClass().getName());
    }

    public static void main(String[] args) {
        genericity<String> str = new genericity<String>("Hello!");
        str.showType("hi hi ~");
        String s = str.getObj();
        System.out.println("value= "+s);
    }
}
