package com.guangming.No_14;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by cgm on 2017/9/21.
 *
 */
public class Bank {
    private ReentrantLock lock;
    private Condition funds;
    private final double[] accounts;
    private static int count =0;
    private static int count1 =0;

    public Bank(int n,int account) {
        accounts = new double[n];
        Arrays.fill(accounts,account);
        lock = new ReentrantLock();
        funds = lock.newCondition();
    }

    //转账
    public void transfer(int from, int to, double amount) throws InterruptedException {
        // todo tryLock设置时间，防止死锁
//        lock.tryLock(300, TimeUnit.SECONDS);
        lock.lock();
        try {
            while (accounts[from] < amount){
                System.out.println(++count+"await:"+accounts[from]+" < "+amount);
//                println();
                //todo 设置等待时间，防止死锁
                funds.await(10, TimeUnit.SECONDS);
            }
            System.out.println(Thread.currentThread());
            accounts[from] -= amount;
            accounts[to] += amount;
            System.out.println(++count1+":"+from+" to "+to+" : "+amount+" 总额："+getTolte());
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
