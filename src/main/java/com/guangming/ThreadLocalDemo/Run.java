package com.guangming.ThreadLocalDemo;

public class Run {
    public static void main(String[] args) {


        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Test1:" + Tools.threadLocalExt.get());
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ThreadA threadA = new ThreadA();
        threadA.start();
    }
}
