package com.guangming.No_14;

public class MyVolatile2 {
    private static volatile boolean bChanged;


    public static void main(String[] args) throws InterruptedException {
        new Thread() {

            public int i;

            @Override
            public void run() {
                for (;;) {
                    i++;
                    if (bChanged == !bChanged) {
                        System.out.println(i);
                        System.out.println("!=");
                        System.exit(0);
                    }
                }
            }
        }.start();
        Thread.sleep(11);
        new Thread() {

            @Override
            public void run() {
                for (;;) {
                    bChanged = !bChanged;
                }
            }
        }.start();
    }
}
