package com.guangming;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by cgm on 2017/11/19.
 */
public class MyTest {
    public static void main1(String[] args) {
        int[] arr = {1,1,1,1,1,1,0,0,0,0};
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 0);
        map.put(0, 0);
        for (int i : arr) {
            int i1 = map.get(i) + 1;
            map.put(i, i1);
        }
        System.out.println("1:"+map.get(1)+" 0:"+map.get(0));
    }

    public static void main(String[] args) throws UnsupportedEncodingException {
        String a = "大";
        byte[] buf = a.getBytes();
        System.out.println(buf.length+"Byte="+buf.length/1024+"KB" );
        System.out.println(a.getBytes("UTF-8").length);
    }
}
