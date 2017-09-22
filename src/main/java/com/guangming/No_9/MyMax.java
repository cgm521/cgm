package com.guangming.No_9;

import java.util.*;

/**
 * Created by cgm on 2017/9/14.
 */
public class MyMax {
    public static void main(String[] args) {
        int[] s = {12, 1, 45, 2, 7, 67};
        List<Integer> list = new ArrayList<Integer>();
        list.add(12);
        list.add(13);
        list.add(44);
        System.out.println(max(list));

    }

    //返回最大值
    public static <T extends Comparable> T max(Collection<T> c) {
        if (c.isEmpty()) throw new NoSuchElementException();
        Iterator<T> iterator = c.iterator();
        T t = iterator.next();
        while (iterator.hasNext()) {
            T next = iterator.next();
            if (t.compareTo(next) < 0) {
                t = next;
            }
        }
        return t;

    }
}
