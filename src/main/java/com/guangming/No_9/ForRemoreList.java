package com.guangming.No_9;

import com.guangming.My8_31.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by cgm on 2017/9/7.
 * for remore List 优化
 */
public class ForRemoreList {
    public static void main(String[] args) throws Exception {
        String str1 = new String("abcde");
        String str2 = new String("abcde");
        String str3 = new String("abcde");
        String str4 = new String("abcde");
        String str5 = new String("abcde");
        List list = new ArrayList();
        list.add(str1);
        list.add(str2);
        list.add(str3);
        list.add(str4);
        list.add(str5);
        ArrayList<List> lists = new ArrayList();
        lists.add(list);
        ArrayList<List> lists2 = (ArrayList)lists.clone();
        System.out.println(lists == lists);
        System.out.println(lists == lists2);
        System.out.println(lists2.hashCode());
        Iterator var10 = lists2.iterator();

        while(var10.hasNext()) {
            List list1 = (List)var10.next();
            lists.remove(list1);
        }

        System.out.println("after remove:list.size()=" + list.size());
        System.out.println("------------------");
        String s1 = "123";
        String s2 = "456";
        change(s1, s2);
        System.out.println(s1);
        System.out.println(s1.hashCode());
        System.out.println("--------------");
        StringBuffer s3 = new StringBuffer("123");
        StringBuffer s4 = new StringBuffer("456");
        String intern = s2.intern();
        change(s3, s4);
        System.out.println(s3);
    }

    public static void change(String s1, String s2) throws Exception {
        s1 = s1 + s2;
        System.out.println(s1);
    }

    public static void change(StringBuffer s1, StringBuffer s2) {
        s1.append(s2);
    }

    public static void test1(List list) {
        System.out.println("list.size()=" + list.size());

        for(int i = 0; i < list.size(); ++i) {
            if(((String)list.get(i)).startsWith("abcde")) {
                list.remove(i);
            }
        }

    }

    public static void test2(List list) {
        for(int i = list.size() - 1; i >= 0; --i) {
            if(((String)list.get(i)).startsWith("abcde")) {
                list.remove(i);
            }
        }

    }

    public static void test3(List list) {
        for(int i = 0; i < list.size(); ++i) {
            if(((String)list.get(i)).startsWith("abcde")) {
                list.remove(i);
                --i;
            }
        }

    }

    public static void test4(List list) {
        if(null != list && list.size() > 0) {
            Iterator it = list.iterator();

            while(it.hasNext()) {
                Student stu = (Student)it.next();
                if(stu.getAgr() == "12") {
                    it.remove();
                }
            }
        }

    }
}
