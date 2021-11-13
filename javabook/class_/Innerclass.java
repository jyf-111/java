
public class Innerclass {
    private int x = 3;
    // 创建嵌套类法1
    Innerone ino = new Innerone();
    private static int y = 100;

    // 内嵌类
    public class Innerone {
        private int x = 5;

        public void InnerMethod() {
            System.out.println("x is " + x);
        }

        public void InnerMethod2() {
            System.out.println("this.x is " + this.x);
            System.out.println("Innerclass.this.x is " + Innerclass.this.x);
        }
    }

    // 静态内嵌类
    public static class Innertwo {
        public static void Method() {
            System.out.println("x is " + y);
        }
    }

    public void outerMethod() {
        System.out.println("x is " + x);
        ino.InnerMethod();
        ino.InnerMethod2();
        // 创建嵌套类法2
        Innerone ino2 = new Innerone();
    }

    public static void main(String[] args) {
        Innerclass my = new Innerclass();
        my.outerMethod();
        // 创建嵌套类法三
        Innerone ino3 = new Innerclass().new Innerone();
        
        //静态内嵌类调用
        Innerclass.Innertwo.Method();//静态方法直接调用
        new Innerclass.Innertwo().Method();//创建内嵌类对象实例]
    }
}
