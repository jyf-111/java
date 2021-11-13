import java.util.*;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class bank {
    private double[] accounts = null;
    private Lock bankLock;
    private Condition sufficientFunds;

    public bank(int n,double initialBalance){
        accounts = new double[n];
        Arrays.fill(accounts, initialBalance);
        bankLock = new ReentrantLock();
        sufficientFunds = bankLock.newCondition();
    }

    public void transfer(int from, int to, double amount)throws InterruptedException {
        bankLock.lock();
        try{
            // if (accounts[from] < amount)
            //     return;
            while(accounts[from]<amount){
                sufficientFunds.await();
            }
            System.out.print(Thread.currentThread());
            accounts[from] -= amount;
            System.out.printf("%10.2f from %d to %d", amount, from, to);
            accounts[to] += amount;
            System.out.printf("Total Balance: %10.2f\n", getTotalBalance());
            sufficientFunds.signalAll();
        }finally{
            bankLock.unlock();
        }
    }

    public double getTotalBalance() {
        bankLock.lock();
        try{
            double sum = 0;
            for (double i : accounts) {
                sum += i;
            }
            return sum;
        }finally{
            bankLock.unlock();
        }
    }

    public int size() {
        return accounts.length;
    }
}

public class UnsynchBankTest {
    public static final int NACCCOUNTS = 100;
    public static final double INITIAL_BALANCE = 1000;
    public static final double MAX_AMOUNT = 1000;
    public static final int DELAY = 10;

    public static void main(String[] args) {
        var bank = new bank(NACCCOUNTS, INITIAL_BALANCE);
        for(int i=0 ;i< NACCCOUNTS ;i++){
            int fromAccount = i;
            Runnable r = () -> {
                try{
                    while (true) {
                        int toAccounts = (int)(bank.size() * Math.random());
                        double amount = MAX_AMOUNT * Math.random();
                        bank.transfer(fromAccount, toAccounts, amount);
                        Thread.sleep((int)(DELAY*Math.random()));
                    }
                }catch(InterruptedException e){

                }
            };
            var t = new Thread(r);
            t.start();
        }
    }
}