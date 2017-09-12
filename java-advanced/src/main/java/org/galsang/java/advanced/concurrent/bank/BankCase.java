package org.galsang.java.advanced.concurrent.bank;

/**
 * Description： 银行取款，，，柜台 和 ATM自动取款机 同时取款
 * <br /> Author： galsang
 */
public class BankCase {

    public static void main(String[] args) {

        Bank bank = new Bank();

        Runnable atmR = () -> {
            for (int i = 0; i < 10; i++) {
                bank.withdrawals(1000);
            }
        };

        Runnable counterR = () -> {
            for (int i = 0; i < 10; i++) {
                bank.withdrawals(100);
            }
        };

        Runnable depositR = () -> {
            for (int i = 0; i < 5; i++) {
                bank.deposit(100);
            }
        };

        Thread atm = new Thread(atmR);
        atm.start();

        Thread counter = new Thread(counterR);
        counter.start();

        Thread deposit = new Thread(depositR);
        deposit.start();


    }

}
