
class Consumer extends Thread {
    private SharedArea sharedObject;

    public Consumer(SharedArea shared) {
        sharedObject = shared;
    }

    public void run() {
        int value;
        do {
            try {
                Thread.sleep((int) (Math.random() * 3000));
            } catch (InterruptedException e) {

            }
            value = sharedObject.getSharedInt();
            System.out.println("消费" + value);
        } while (value != 10);
    }
}

class Producer extends Thread {
    private SharedArea sharedObject;

    public Producer(SharedArea shared) {
        sharedObject = shared;
    }

    public void run() {
        for (int count = 1; count <= 10; count++) {
            try {
                Thread.sleep((int) (Math.random() * 3000));
            } catch (InterruptedException e) {

            }
            sharedObject.setSharedInt(count);
            System.out.println("生产：" + count);
        }
    }
}

class SharedArea {
    private int SharedInt = -1;
    private boolean writeable = true;

    public synchronized int getSharedInt() {
        while (writeable) {
            try {
                wait();
            } catch (InterruptedException e) {

            }
        }
        writeable = true;
        notify();
        return SharedInt;
    }

    public synchronized void setSharedInt(int value) {
        while (!writeable) {
            try {
                wait();
            } catch (InterruptedException e) {

            }
        }
        SharedInt = value;
        writeable = false;
        notify();
    }

}

public class shareTest {
    public static void main(String[] args) {
        SharedArea sharedObject = new SharedArea();
        Producer p = new Producer(sharedObject);
        Consumer c = new Consumer(sharedObject);
        p.start();
        c.start();
    }
}
