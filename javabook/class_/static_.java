
public class static_ {
    static int count = 0;
    String username;
    int age;
    // 给静态变量赋初值
    static {
        count = 0;
    }

    public static_(String name, int yourage) {
        username = name;
        age = yourage;
    }

    void login() {
        count++;
        System.out.println("you are no: " + count + " user");
    }

    void speak(String words) {
        TalkPlace.talkArea = TalkPlace.talkArea + username + "say" + words + '\n';
    }

    public static void main(String[] args) {
        static_ user1 = new static_("张三", 20);
        user1.login();
        user1.speak("hello");
        static_ user2 = new static_("李四", 16);
        user2.login();
        user2.speak("good morning");

        user1.speak("bye");
        System.out.println("talkarea is bellow");
        System.out.println(TalkPlace.talkArea);
        System.out.println(static_.count);// 推荐
        System.out.println(static_.count);// 不推荐
    }
}

class TalkPlace {
    static String talkArea = "";
}
