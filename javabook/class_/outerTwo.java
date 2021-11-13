
public class outerTwo {
    private int x = 3;
    
    public void outerMethod(int m){
        final int n = x+2;
        class Innertwo{
            private int y = 5;
            public void InnerMethod(){
                System.out.println("y = "+y);
                System.out.println("n = "+n);//方法中只有常量可以访问
                System.out.println(m);//JDK8开始形参也可
                System.out.println("x = "+x);
            }
        }
        //先定义后使用
        Innertwo in2 = new Innertwo();
        in2.InnerMethod();
    }
    public static void main(String[] args) {
        outerTwo my = new outerTwo();
        my.outerMethod(8);
    }
}
