package com.guangming.ThreadLocalDemo.InheritableThreadLocal;

public class ThreadB extends Thread {
    private String lock = "";
    private int i = 0;



    @Override
    public void run() {
        synchronized (lock) {
            try {
                while (true){
                    if ("A" == Tools.ext.get()) {
                        Tools.ext.set(++i);
                        System.out.println("ThreadB set :" + i);
                        lock.notify();
                    } else {
                        System.out.println("B wait");
                        lock.wait();
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}
