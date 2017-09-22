package com.guangming.No_14;

import java.util.Arrays;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by cgm on 2017/9/21.
 * 银行实体
 */
public class Bank {
    private ReentrantLock lock;
    private Condition funds;
    private final double[] accounts;
    private static int count =0;

    public Bank(int n,int account) {
        accounts = new double[n];
        Arrays.fill(accounts,account);
        lock = new ReentrantLock();
        funds = lock.newCondition();
    }

    //转账
    public void transfer(int from, int to, double amount) throws InterruptedException {
        lock.lock();
        try {
            while (accounts[from] < amount){
                System.out.println(++count+"await:"+accounts[from]+" < "+amount);
//                println();
                funds.await();
            }
            System.out.println(Thread.currentThread());
            accounts[from] -= amount;
            accounts[to] += amount;
            System.out.println(from+" to "+to+" : "+amount+" 总额："+getTolte());
            funds.signalAll();
        }finally {
            lock.unlock();
        }
    }
    //获取总金额
    private double getTolte(){
        double count = 0;
        for (double d : accounts) {
            count += d;
        }
        return count;
    }
    private void println(){
        for (int i =0;i<accounts.length;i++) {
            System.out.println(i+" : "+accounts[i]);
        }
    }
}
