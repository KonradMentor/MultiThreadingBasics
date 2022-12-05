package org.example.bank;

import java.util.Random;


public class AccountManager {

    private Account acc1 = new Account();
    private Account acc2 = new Account();

    public void transfer() {
        Random random = new Random();
        for (int i = 0; i < 10000; i++) {
            Account.transfer(acc1, acc2, random.nextInt(100));
        }
    }

    public void secondTransfer() {
        Random random = new Random();
        for (int i = 0; i < 10000; i++) {
            Account.transfer(acc1, acc2, random.nextInt(100));
        }
    }

    public void printState() {
        System.out.println("Account 1 balance: " + acc1.getBalance());
        System.out.println("Account 2 balance: " + acc2.getBalance());
        System.out.println("Total balance: " + (acc1.getBalance() + acc2.getBalance()));
    }
}
