abstract class Stuff{
    private long id;
    private String ID;
    private String name;
    private int age;
    private char gender;
    public abstract void Print();

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getID() {
        return ID;
    }
    public void setID(String iD) {
        ID = iD;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }
    
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        postFormate(sb);
        preFormate(sb);
        return sb.toString();
        // return "Stuff [ID=" + ID + ", age=" + age + ", gender=" + gender + ", id=" + id + ", name=" + name + "]";
    }

    protected void preFormate(StringBuffer sb){
        ID = sb.substring(0, 5);
        age = Integer.parseInt(sb.substring(5, 7));
        gender = sb.substring(7, 8).charAt(0);
        name = sb.substring(8, 11);
    }

    protected void postFormate(StringBuffer sb){
        sb.append(ID);
        sb.append(age);
        sb.append(gender);
        sb.append(name);
    }
}

class Student extends Stuff{
    private String major;

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public void Print() {
        System.out.println();
        System.out.println(getID()+getId()+getName()+getAge()+getGender()+major+'\n');
    }

    @Override
    public String toString() {
        return super.toString()+':'+"Student [major=" + major + "]";
    }
}

class Teacher extends Stuff{
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void Print() {
        
        System.out.println(getID()+getId()+getName()+getAge()+getGender()+title);
    }

    @Override
    public String toString() {
        return super.toString()+':'+"Teacher [title=" + title + "]";
    }
}

class executive extends Stuff{
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    private String position;

    @Override
    public void Print() {
        System.out.println("-------------");
        System.out.println(getID()+':'+getId()+':'+getName()+':'+getAge()+':'+getGender()+':'+position);
    }

    @Override
    public String toString() {
        return super.toString()+':'+"executive [position=" + position + "]";
    }
}

public class University {
    public static void main(String[] args) {
        Stuff s = new Student();
        Stuff t = new Teacher();
        Stuff e = new executive();
        ((Student)s).setMajor("Math");
        ((Student)s).setID("10015");
        ((Student)s).setId(1001); 
        ((Student)s).setName("jyf");
        ((Student)s).setAge(20);
        ((Student)s).setGender('w');

        ((Teacher)t).setTitle("profession");
        ((Teacher)t).setID("50051");
        ((Teacher)t).setId(5005); 
        ((Teacher)t).setName("yyd");
        ((Teacher)t).setAge(40);
        ((Teacher)t).setGender('m');

        ((executive)e).setPosition("master");
        ((executive)e).setID("90097");
        ((executive)e).setId(9009); 
        ((executive)e).setName("hii");
        ((executive)e).setAge(80);
        ((executive)e).setGender('m'); 
        // ((Student)s).Print();
        s.Print();
        t.Print();
        e.Print();
        System.out.println(s.toString());
        System.out.println(t.toString());
        System.out.println(e.toString());
        e.Print();
    }
}