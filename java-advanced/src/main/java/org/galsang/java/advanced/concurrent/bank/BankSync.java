package org.galsang.java.advanced.concurrent.bank;

import lombok.extern.java.Log;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Description： 银行存取款
 * <br /> Author： galsang
 */
@Log
public class BankSync {

    /**
     * 账户余额
     */
    private int balance = 1000;

    /**
     * 取款
     *
     * @param amount 取款金额
     */
    public synchronized void withdrawals(int amount) {

        try {
            Thread.sleep(1000);

            while (balance < amount) {
                log.info("账户余额不足 = " + balance + " ###### " + " amount = " + amount);
                wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        balance = balance - amount;
        log.info("账户余额： " + balance + " ===== " + Thread.currentThread().getName());


    }

    /**
     * 存款
     *
     * @param amount 存款金额
     */
    public synchronized void deposit(int amount) {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        balance = balance + amount;
        notifyAll();
        log.info("账户存入" + amount + " 账户余额： " + balance + " ===== " + Thread.currentThread().getName());

    }


}
