package com.guangming.ThreadLocalDemo;

/**
 * @auth cgm
 * @date 2017/12/10 23:29
 */
public class test {
    ThreadLocal<Long> longLocal = new _ThreadLocalExt<Long>();

    ThreadLocal<String> stringLocal = new _ThreadLocalExt<String>();

    public void set() {
        longLocal.set(Thread.currentThread().getId());
        stringLocal.set(Thread.currentThread().getName());
    }

    public long getLong() {
        return longLocal.get();
    }

    public String getString() {
        return stringLocal.get();
    }

    public static void main(String[] args) throws InterruptedException {
        final test test = new test();
        test.set();
        System.out.println(test.getLong());
        System.out.println(test.getString());

        Thread thread1 = new Thread(){
            public void run() {
                test.set();
                System.out.println(test.getLong());
                System.out.println(test.getString());
            };
        };
        thread1.start();
        thread1.join();

        System.out.println(test.getLong());
        System.out.println(test.getString());
    }
}

class _ThreadLocalExt<T> extends ThreadLocal<T>{
    public  _ThreadLocalExt() {
        System.out.println("构造");
    }
}