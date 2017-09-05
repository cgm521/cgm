package com.guangming.My8_31;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.function.Predicate;

/**
 * Created by cgm on 2017/8/28.
 */
public class MyLambda {

    private static int i = 0;

    private static int j = 0;

    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        list.add("aaa");
//        list.add("b2");
//        list.add("b22222");
//
//        list.removeIf(Objects::isNull);
//        Collections.sort(list,(String s, String b) -> {
//            return s.length() - b.length();
//        });
//        System.out.println(list.toString());
//        Comparator<String> stringComparator = (String s, String d) -> d.length() - s.length();
//        stringComparator.toString();
//
//        BiFunction<String,String,Integer> b = (String s, String d) -> d.length() - s.length();


//        ArrayList<String> arrayList = new ArrayList<>();
//        arrayList.add(0,"12");
//        arrayList.add(0,"11");
//        arrayList.add("12");
//        arrayList.add("11");
//        arrayList.add("1");
//        arrayList.add("1");
//        final  int a = 1;
//        Stream<com.guangming.My8_31.Student> stream = arrayList.stream().map(com.guangming.My8_31.Student::new);
//        com.guangming.My8_31.Student[] students1 = stream.toArray(com.guangming.My8_31.Student[]::new);
//        List<com.guangming.My8_31.Student> students = stream.collect(Collectors.toList());
//        for (int i=0;i<10;i++){
//            students.forEach(s->{
//                System.out.println(a);
//            });
//        }
//        students.forEach(s->{
//            arrayList.add(1,"2");
//            System.out.println(a);
//            System.out.println(s.agr);
//        });

//        HttpSecurity http = new
//        repeat(10,i-> System.out.println("hello word！"+(9-i)));
//
//        Predicate.isEqual(null).negate();

        ActionListener a= new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(new Date());

            }
        };
    }

    public static void repeat(int n,Int runnable) {
        for (int i=0;i<n;i++){
            runnable.acc(i);
            System.out.println("---");

        }
    }
    public interface Int{
        void acc(int v);
    }
}
