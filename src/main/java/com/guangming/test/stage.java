package com.guangming.test;

public class stage {
    private int count;
    private stage(){}
    private static class Singleton{
        static stage ins=new stage();
    }

    public static stage getIns(){
        return Singleton.ins;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
