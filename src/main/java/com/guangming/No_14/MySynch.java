package com.guangming.No_14;

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
            Thread t = new Thread(r);
            t.start();
        }
    }
}
