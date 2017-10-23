package com.guangming.No_14;

import java.io.*;
import java.util.*;

/**
 * Created by cgm on 2017/9/25.
 */
public class MyFile {
    public static void main(String[] args) {
        int count =0;
        File file = new File("F:\\test.log");
        Reader reader =null;
        StringBuilder stringBuffer = new StringBuilder();
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));//构造一个BufferedReader类来读取文件
            String s = null;
            while((s = br.readLine())!=null){//使用readLine方法，一次读一行
                stringBuffer.append(System.lineSeparator()+s);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String string = stringBuffer.toString();
        System.out.println(stringBuffer);
        String[] split1 = string.split("2017-09-22");
        for (String s : split1) {
            if (s.indexOf("首尔牛肉米线")!=-1){
                count++;
            }
        }
        System.out.println("count"+count);
        String[] split = string.split("\"id\":");
        String[] strings = new String[split.length];
        System.arraycopy(split,1,strings,0,split.length-1);
        List<String> list = new ArrayList<>();
        for (String s : strings) {
            //System.out.println(s.substring(s.indexOf("{\"id\":\"")+1,s.lastIndexOf("\",\"storeId\":\"")));
            if (s != "" && s != null) {
                try {
                    list.add(s.substring(s.indexOf("{\"id\":\"") + 1, s.lastIndexOf("\",\"storeId\":\"")));
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println(s);
                }
            }

        }
        System.out.println(list.size());
        Set<String> set = new HashSet<>(list);
        System.out.println(set.size());
        HashMap<Object, Object> map = new HashMap<>();
        Set<Map.Entry<Object, Object>> entrySet = map.entrySet();
        entrySet.forEach(entry -> {

        });
    }
}
