//猜数字游戏
import java.util.Random;
import java.util.Scanner;

class Guess {
    enum Result{
        EQUAL,LESS,GREAT,EXCEED;
    }

    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
    public static int getBound() {
        return bound;
    }
    public static void setBound(int bound) {
        Guess.bound = bound;
    }
    public static int getLimit() {
        return limit;
    }
    public static void setLimit(int limit) {
        Guess.limit = limit;
    }
    public static int getCount() {
        return count;
    }
    public static void setCount(int count) {
        Guess.count = count;
    }
    private static int bound = 10;
    private int value;
    private static int limit = 10;
    private static int count = 0;
    private Random ran = new Random(System.currentTimeMillis());
    public Guess(){
        value = ran.nextInt(bound);
    }
    public Guess(int bound,int limit){
        this.bound = bound;
        this.limit = limit;
        value = ran.nextInt(bound);
    }
    public void start(){
        count = 0;
    }
    public Result judge(int value){
        count++;
        if(value == this.value) return Result.EQUAL;
        if(value<this.value) return Result.LESS;
        if(value>this.value) return Result.GREAT;
        if(value>=this.limit) return Result.EXCEED;
        return null;
    }
}

public class Driver{
    private Scanner in = new Scanner(System.in);
    public void guess(Guess guess){
        System.out.println("Press in a number");

        boolean flag = true;
        while(Guess.getCount()!=Guess.getBound() && flag){
            Guess.Result result = guess.judge(in.nextInt());
            switch(result){
                case EQUAL: System.out.println("congratulation!");flag = false;break;
                case LESS : System.out.println("Sorry, too small, remaining: "+(guess.getBound()-guess.getCount()));break;
                case GREAT: System.out.println("Sorry, too large, remaining: "+(guess.getBound()-guess.getCount()));break;
                case EXCEED: System.out.println("Sorry, exhausted, value: "+ guess.getValue());flag = false;break;
                default : ;
            }
        }
    }
    public static void main(String[] args) {
        Driver driver = new Driver();
        boolean flag = true;
        while(flag){
            Guess guess = new Guess();
            guess.start();
            driver.guess(guess);
            System.out.println("if continue : Y/N");
            if(driver.in.next().charAt(0)!='Y'){
                break;
            }
        }
    }
}