package com.guangming.No_14;

import java.util.Calendar;
import java.util.concurrent.atomic.AtomicLong;

public class MyVolatile3 {
    public volatile  static int count = 0;

    public volatile static AtomicLong aLong=new AtomicLong(0);

    public static void inc() {

        //这里延迟1毫秒，使得结果明显
//        try {
//            Thread.sleep(1);
//        } catch (InterruptedException e) {
//        }
        aLong.incrementAndGet();
        count++;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    inc();
                }
            }).start();
        }
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(aLong);
        System.out.println(count);
    }

        private static boolean stopFlag;

    public static void main1(String[] args) throws InterruptedException {
        Thread volatileThread = new Thread() {
            @Override
            public void run() {
                while (!stopFlag) {
                    System.out.print(Calendar.getInstance().get(Calendar.SECOND) + ",");
                    try {
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        volatileThread.start();
        Thread.sleep(1000);
        stopFlag = true;
    }
}

