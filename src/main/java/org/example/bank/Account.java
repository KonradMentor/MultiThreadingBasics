package org.example.bank;


class Account {

    private int balance = 10000;

    public synchronized void  deposit(int amount) {
        balance += amount;
    }

    public synchronized boolean withdraw(int amount) {
        if (balance > amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public int getBalance() {
        return balance;
    }

    public static void transfer(Account acc1, Account acc2, int amount) {
        if (acc1.withdraw(amount)) {
            acc2.deposit(amount);
        }
    }
}
