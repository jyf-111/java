
public class Person {

    private String address;
    private String name;
    private int age;
    private Person[] children = null;
    // 初始化块
    {
        address = "无锡";
        name = "无名氏";
        age = 100;
    }

    public Person() {
    }

    public Person(String myname, int myage, Person chs[]) {
        name = myname;
        age = myage;
        children = chs;
    }

    public Person(String name1, String address1, int age1) {
        name = name1;
        address = address1;
        age = age1;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void changeName(String new_name) {
        name = new_name;
    }

    public void inccAge() {
        age++;
    }

    public void setAge(int new_age) {
        age = new_age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String x) {
        address = x;
    }

    public Person[] getchild() {
        return children;
    }

    public void setChildren(Person[] mychildren) {
        children = mychildren;
    }

    public String toString() {
        String s = "Name: " + name + '\n';
        s += "Age: " + age + '\n';
        s += "Address: " + address + '\n';
        return s;
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();

        p1.changeName("John");
        p1.setAge(23);
        p1.setAddress("江西");
        p1.inccAge();
        p2.changeName("Mary Ann");
        p2.setAge(22);
        p2.setAddress("北京");

        Person p3 = p1;
        p3.age++;
        Person[] c1 = { p1, p2 };
        p3 = new Person("John", 20, c1);
        System.out.println(p1);
        System.out.println(p2);
        Person[] mychild = p3.getchild();
        for (int k = 0; k < mychild.length; k++) {
            System.out.println("child" + (k + 1) + ':' + mychild[k]);
        }
    }
}
