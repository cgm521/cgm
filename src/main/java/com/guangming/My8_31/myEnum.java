package com.guangming.My8_31;

import java.util.Scanner;

/**
 * Created by cgm on 2017/8/23.
 */
public class myEnum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input=in.next().toUpperCase();
        Size size = Enum.valueOf(Size.class,input);
        System.out.println("size="+size+Size.ME.name()
        );
    }
}


enum Size{
    SMALL("S"),ME("M");

    private String abb;
    private Size(String abb){
        this.abb=abb;
    }

    public String getAbb(){
        return abb;
    }
}
