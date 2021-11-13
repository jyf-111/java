
public class String_ {
    public static void main(String[] args) {
        String s1 = "hello world!";
        String s2 = "hello world!";
        String s3 = new String("hello world!");// 强制生成新对象

        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);

        String s4 = s1.intern();// JDK1.6是复制，JDK1.7是引用
        System.out.println(s1 == s4);

        System.out.println(s4.length());
        String s = "Hello";
        s = s + "Mary" + 4;
        System.out.println(s);
        s = s.concat("7");// 创建一个新字符串
        System.out.println(s);

        String c = "Java是面向对象的语言,JavaScript是脚本语言";
        int k = -1;
        do {
            k = c.indexOf('是', k + 1);
            System.out.println(k + "\t");
        } while (k != -1);


        StringBuffer str1 = new StringBuffer();
        str1.append("Hellom,mary!");
        str1.insert(6, 30);
        System.out.println(str1);
    

    //反转字符串
        String x = "dont say i was god";
        int len = x.length();
        StringBuffer dest = new StringBuffer(len);
        for(int i= len-1 ; i>=0;i--){
            dest.append(x.charAt(i));
        }
        System.out.println(dest);
    
    //界定分隔符
        String all = String.join("/", "S","M","L","XL");
        System.out.println(all);

        String repeated = "Java".repeat(3);
        System.out.println(repeated);

        System.out.println("hello".equals("hello"));
        System.out.println("Hello".equalsIgnoreCase("hello"));
        System.out.println("hello".compareTo("hello"));

        System.out.println("hello🍺".length());
        System.out.println("hello\u1F37A".codePointCount(0, "hello🍺".length()));

        int[] codePoints = "hello🍺".codePoints().toArray();
        String str = new String(codePoints,0,codePoints.length);
        System.out.println(str);

        StringBuilder builder = new StringBuilder();
        builder.append("hi");
        builder.append("~hi");
        System.out.println(builder);
    }

}
