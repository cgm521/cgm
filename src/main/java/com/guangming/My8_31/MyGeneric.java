package com.guangming.My8_31;

/**
 * Created by cgm on 2017/8/31.
 * 泛型
 */
public class MyGeneric<M> {
    private M t;

    public M getT() {
        return t;
    }


    public void setT(M t) {
        this.t = t;
    }

    public MyGeneric(M t) {
        this.t = t;
    }

    @Override
    public String toString() {
        return "com.guangming.My8_31.MyGeneric{" +
                "t=" + t +
                '}';
    }
}
