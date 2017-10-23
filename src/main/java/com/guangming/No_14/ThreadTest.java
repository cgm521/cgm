package com.guangming.No_14;

/**
 * Created by cgm on 2017/10/17.
 */
public class ThreadTest implements Runnable{
    int b = 100;
    String str = "aaa";
    synchronized void m1()throws InterruptedException{
         str = "bbb";
         //        Thread.sleep(500);//6
        System.out.println("b1="+str);
    }
    synchronized void m2()throws InterruptedException{
//        Thread.sleep(250);//5
         str = "ccc";
        b=2000;
        System.out.println("b2="+str);
    }

    public static void main(String[] args) throws InterruptedException{
        ThreadTest threadTest = new ThreadTest();
        Thread thread = new Thread(threadTest);//1
        thread.start();//2
        threadTest.m2();//3
        System.out.println("b3="+threadTest.str);//4

    }
    @Override
    public void run() {
        try {
            m1();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
