package com.MyThread.MyLock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by cgm on 2017/11/30.
 */
public class WaitQueueLengthTest {
    public static void main(String[] args) {
        Service service = new Service();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                service.awaitMethod();
            }
        };
        Thread[] thread = new Thread[10];
        for (int i = 0; i < 10; i++) {
            thread[i] = new Thread(runnable);
        }
        for (int i = 0; i < 9; i++) {
            thread[i].start();
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        service.notityMethod();
    }
}

class Service {
    private ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void awaitMethod() {
        try {
            System.out.println(Thread.currentThread().getName()+lock.isLocked());
            lock.lock();
            System.out.println(Thread.currentThread().getName()+lock.isLocked());
            Thread.sleep(30000);
            condition.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void notityMethod() {
        try {
            lock.lock();
            System.out.println("wait num" + lock.getWaitQueueLength(condition));

            condition.signalAll();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
