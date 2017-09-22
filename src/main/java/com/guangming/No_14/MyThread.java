package com.guangming.No_14;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by cgm on 2017/9/19.
 */
public class MyThread {
    public static void main(String[] args) throws Exception{
        Thread thread = new Thread("thread");
        System.out.println(System.currentTimeMillis());
        thread.start();
        System.out.println(System.currentTimeMillis());
        Thread thread1 = Thread.currentThread();
        System.out.println(thread1.getName());
        System.out.println(thread.getName());
        thread1.interrupt();
        System.out.println(thread1.isInterrupted());
        Lock lock = new ReentrantLock();
        Condition condition = lock.newCondition();
        condition.await();
    }
}
