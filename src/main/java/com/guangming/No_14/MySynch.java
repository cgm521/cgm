package com.guangming.No_14;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MySynch {
    public static void main(String[] args){
        Bank bank = new Bank(100, 10000);
        int i =100;
        while (i-- >0) {
            Runnable r = () -> {
                while (true) {
                    try {
                        bank.transfer((int) (Math.random() * 100), (int) (Math.random() * 100), Math.floor(Math.random() * 1000));
                        Thread.sleep((int) (10 * Math.random()));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            };
            ExecutorService executorService = Executors.newCachedThreadPool();
            Future<?> submit = executorService.submit(r);
            executorService.shutdown();
            Thread t = new Thread(r);
            t.start();
        }
//        try {
//            b.get().transfer(1,2,2.12);
//            b.remove();
//            b.set(new Bank(1,2));
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        ThreadLocalRandom localRandom = ThreadLocalRandom.current();
    }
    public static final ThreadLocal<Bank> b=ThreadLocal.withInitial(()->new Bank(10,1000));
}
