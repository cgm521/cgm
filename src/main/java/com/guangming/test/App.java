package com.guangming.test;

public class App {
    public static void main(String[] args) {
        stage ins = stage.getIns();
        System.out.println(ins.getCount());
        ins.setCount(12);
        System.out.println(ins.getCount());

        stage ins1 = stage.getIns();
        System.out.println(ins1.getCount());
    }
}
