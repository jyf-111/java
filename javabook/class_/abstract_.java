
public class abstract_ {
    public static void main(String[] args) {
        Animal a[] = new Animal[3];
        a[0] = new Dog("dog-A");
        a[1] = new Fish("cat-A");
        a[2] = new Dog("dog-B");
        for (int i = 0; i < 3; i++) {
            System.out.println(a[i].name + " has " + a[i].getLeg() + " legs");
        }
    }
}

abstract class Animal {
    String name;

    abstract public int getLeg();
}

class Dog extends Animal {
    int leg = 4;
    public Dog(String n) {
        name = n;
    }

    @Override
    public int getLeg() {
        return leg;
    }
}

class Fish extends Animal {
    public Fish(String n) {
        name = n;
    }

    @Override
    public int getLeg() {
        return 0;
    }
}
