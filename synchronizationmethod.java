package day3;
import java.util.Iterator;
import java.util.Iterator;

class Bank {

    synchronized void withdraw(int amount) {
        System.out.println("Withdrawing " + amount);
        try {
            Thread.sleep(4000);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Withdrawal completed");
    }
}

class program extends Thread {
    Bank bank;
    program(Bank bank) {
        this.bank = bank;
    }
    public void run() {
        bank.withdraw(500);
    }
}
public class synchronizationmethod  {
    public static void main(String[] args) {
        Bank bank = new Bank();
        program t1 = new program(bank);
        program t2 = new program(bank);

        t1.start();
        t2.start();
    }
}