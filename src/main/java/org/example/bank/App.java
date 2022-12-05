package org.example.bank;


public class App {

    public static void main(String[] args) throws Exception {
        final AccountManager accountManager = new AccountManager();
        Thread t1 = new Thread(accountManager::transfer);
        Thread t2 = new Thread(accountManager::secondTransfer);

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        accountManager.printState();
    }
}
