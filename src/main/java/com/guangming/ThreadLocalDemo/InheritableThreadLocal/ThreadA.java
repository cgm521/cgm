package com.guangming.ThreadLocalDemo.InheritableThreadLocal;

public class ThreadA extends ThreadB {
    private String lock = "";



    @Override
    public void run() {
        synchronized (lock) {
            try {
                while (true) {
                    if ("A" == Tools.ext.get()) {
                        System.out.println("A wait!");
                        lock.wait();
                    } else {
                        System.out.println("ThreadA get :" + Tools.ext.get());
                        sleep(500);
                        lock.notify();
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
