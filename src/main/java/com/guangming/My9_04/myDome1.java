package com.guangming.My9_04;

import com.guangming.My8_31.MyGeneric;
import com.guangming.My8_31.Student;

import javax.servlet.http.HttpServletRequest;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Dictionary;

/**
 * Created by cgm on 2017/9/4.
 */
@SuppressWarnings("unchecked")
public class myDome1 {

    public static void main(String[] args) {

        JSlider jSlider = new JSlider();
        Dictionary labelTable = jSlider.getLabelTable();
        double d= 12.12;

        MyGeneric<Student> studentMyGeneric = new MyGeneric<Student>(new Student("12"));
        MyGeneric<String> nihao = new MyGeneric<String>("nihao");
        if (studentMyGeneric.getClass() == nihao.getClass()) {
            System.out.println(studentMyGeneric.getClass());
            System.out.println(studentMyGeneric.getT());
            System.out.println(nihao.getClass());
            System.out.println(nihao.getT());
        }
        mytest(12.1,12.2);

//        MyGeneric<String>[] myGenerics = new MyGeneric<String>[10];

        try {
            ArrayList arrayList = ArrayList.class.newInstance();
            arrayList.toArray();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }

    public void te(HttpServletRequest request) {
//        request
    }
    private static  <T> void mytest(T ...t){
        System.out.println(t);
    }
}
