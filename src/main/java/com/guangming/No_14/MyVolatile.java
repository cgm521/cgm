package com.guangming.No_14;

public class MyVolatile {
    private static boolean bChanged;

    public static void main(String[] args) throws InterruptedException {
        new Thread() {
            int i;
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
        Thread.sleep(10);
        new Thread() {

            @Override
            public void run() {
                for (;;) {
                    System.out.println("b");
                    bChanged = !bChanged;
                }
            }
        }.start();
    }
}
