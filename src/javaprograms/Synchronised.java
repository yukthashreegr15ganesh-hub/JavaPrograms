package javaprograms;

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

class WithdrawalThread extends Thread {

    Bank bank;

    WithdrawalThread(Bank bank) {
        this.bank = bank;
    }

    public void run() {
        bank.withdraw(500);
    }
}

public class Synchronised {

    public static void main(String[] args) {

        Bank bank = new Bank();

        WithdrawalThread t1 = new WithdrawalThread(bank);
        WithdrawalThread t2 = new WithdrawalThread(bank);

        t1.start();
        t2.start();
    }
}