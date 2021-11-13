
enum WeekDay{
    Monday,Tuesday,Wednesday;//public static final
    public static void get() {
        for(WeekDay e:WeekDay.values()){
            System.out.println(e);
        }
    }
}

public class Enum_ {
    public static void main(String[] args) {
        WeekDay w = WeekDay.Monday;
        WeekDay.get();
        
        WeekDay what = WeekDay.valueOf("Monday");
        System.out.println(what);
       
        switch(w){
            case Monday:System.out.println("Monday");break;//case必须为枚举常量非限定名称
            case Tuesday:System.out.println("Tuesday");break;
            default:
                break;
        }
    }
}
