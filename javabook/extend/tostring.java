public class tostring {
    public static void main(String[] args) {
        System.out.println(new F());
    }
}

class E{
    public String toString() {
        return "["+getClass().getName()+" this is E ]";
    }
}

class F extends E{
    public String toString() {
        return super.toString()+"this is F";
    }
}
