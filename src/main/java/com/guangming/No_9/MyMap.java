package com.guangming.No_9;

import java.util.*;

/**
 * Created by cgm on 2017/9/14.
 */
public class MyMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.putIfAbsent("a", 0);
        map.merge("a", 1, Integer::sum);

//        map.compute("a",Integer::sum);
//        map.computeIfPresent("a", Integer::sum);
        //键集合
        Set<String> keySet = map.keySet();
        //值集合
        Collection<Integer> values = map.values();
        //键值集合
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        map.forEach((k,v)->{

        });

        WeakHashMap<String, Object> weakHashMap = new WeakHashMap<>();
        weakHashMap.get("12");

    }
}
