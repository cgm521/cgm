package com.guangming.My9_05;

import com.guangming.My8_31.MyGeneric;
import com.guangming.My8_31.Student;
import javafx.util.Pair;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by cgm on 2017/9/5.
 */
public class My_8 {
    public static void main1(String[] args) throws IOException {
        int max = 0,min=0;
        int p;
        int i=0;

        Scanner scanner = new Scanner(System.in);
        String nam = scanner.nextLine();
        System.out.println(nam);
        String[] strings = nam.split(",");
        int m = Integer.parseInt(strings[0]), n = Integer.parseInt(strings[1]);
        p=m;
        ArrayList<String> s = new ArrayList<String>();
        if(p>n)
        {p=n;}
        for(i=p;i>=1;i--)
        {
            if(m%i==0 && n%i==0)
            {
                max=i;
                break;
            }
        }
        min=m*n/max;
        System.out.println(max);
    }

    public static void main(String[] args) {
        Student student = new Student("12");
        MyGeneric<Student> s = new MyGeneric<Student>(student);
        s.getT().getName();
//        System.out.println(s.toString());
//
//        LinkedList<String> linkedList = new LinkedList();
//        linkedList.descendingIterator();
//
//        ArrayList<String> arrayList = new ArrayList<String>();
//        arrayList.ensureCapacity(100);
//        Ts(student);
////        System.out.println(Ts(12,2.11222222222222222222,5,"12"));
//        Tss(s);
        try {
            Pair pair = makePair(Student.class);
            System.out.println(pair.toString());


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static <T> Pair<T,T> makePair(Class<T> c)throws InstantiationException,IllegalAccessException{
        T t = c.newInstance();
        T t1 = c.newInstance();
        return new Pair<T,T>(t, t1);
    }

    public  static <T extends Student> T Ts(T... t){
        System.out.println(t.length);
        System.out.println(t.getClass());

        T s = t[t.length / 2];
        System.out.println(s.getClass());

        return s;
    }

    public static void Tss1(MyGeneric<?> s) {

        Object t = s.getT();
        System.out.println(t==null);
    }
    public static <T> void Tss(MyGeneric<T> s) {

        T t = s.getT();
        System.out.println(t.getClass().getName());
        System.out.println(t==null);
    }
}
