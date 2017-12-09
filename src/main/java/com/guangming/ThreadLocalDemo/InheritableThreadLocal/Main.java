package com.guangming.ThreadLocalDemo.InheritableThreadLocal;

public class Main
{
    public static void main(String[] args) {
        try {
            ThreadA threadA = new ThreadA();
            threadA.start();
            Thread.sleep(1000);
            ThreadB threadB = new ThreadB();
            threadB.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
