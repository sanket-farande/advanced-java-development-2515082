package _05_05.before;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Customer {

    public static void main(String[] args) {
        ATM atm = new ATM();
        BankAccount account = new BankAccount();

        ExecutorService executorService = Executors.newFixedThreadPool(6);

        // same acount multiple transactions, wihthout synchronization this can lead to inconsistent state
        executorService.submit(() -> atm.withdraw(account, 100));
        executorService.submit(() -> atm.withdraw(account, 100));
        executorService.submit(() -> atm.withdraw(account, 100));
        executorService.submit(() -> atm.withdraw(account, 100));
        executorService.submit(() -> atm.withdraw(account, 100));
        executorService.submit(() -> atm.withdraw(account, 100));

        executorService.shutdown();
    }

}
