package com.guangming.No_9;

/**
 * Created by cgm on 2017/9/7.
 */
public class test {
    public static void main(String[] var0) {
        String var1 = "1" ;
        String var2 = new String("1");

        System.out.println(System.identityHashCode(var1));
        System.out.println(System.identityHashCode(var2));
        System.out.println(var1.hashCode()+"---"+var2.hashCode());
        System.out.println(System.identityHashCode("12"));
        System.out.println(System.identityHashCode("1"+"2"));
        System.out.println("---------------");
        Integer i1 = new Integer(12);
        Integer i2 = new Integer(12);
        System.out.println(System.identityHashCode(i1));
        System.out.println(System.identityHashCode(i2));
        System.out.println(i1 == i2);
    }
}
