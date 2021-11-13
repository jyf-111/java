
import java.util.Arrays;
import java.util.Comparator;

public class User implements Comparable<User> {
    private String username;
    private int age;

    public User(String username, int age) {
        this.username = username;
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return username + ":" + age;
    }

    @Override
    public int compareTo(User o) {
        return this.age - o.age;
    }
    
    
    public static void main(String[] args) {
        User[] users = { new User("张三", 30), new User("李四", 20) };
        // Arrays.sort(users);
        Arrays.sort(users,new Comparator<User>(){
            @Override
            public int compare(User o1, User o2) {
                return o1.getAge()-o2.getAge();
            }
        
            @Override
            public boolean equals(Object obj){
                return this==obj;
            } 
        });
        for (int i = 0; i < users.length; i++) {
            System.out.println(users[i]);
        }
    }
}
