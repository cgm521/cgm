package com.guangming.My8_31;

import java.util.Comparator;

/**
 * Created by cgm on 2017/8/28.
 */
public class MyComparator {
    Comparator<String> stringComparator = new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            return 0;
        }
    };
    public void test(){
        String a = "123";
        String b = "123";
        a.compareTo(b);
    }
}
