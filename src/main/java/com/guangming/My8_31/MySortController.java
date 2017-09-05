package com.guangming.My8_31;

import java.util.*;



public class MySortController implements Comparable<MySortController>{
    private static int[] a = {11,  3, 9, 4, 0};
private static myInterface m;

    public static void main1(String[] args) throws Exception{
        InsertSort(a, a.length);
//        Arrays.sort(1,new com.guangming.My8_31.MyComparator(){
//            @Override
//            private int compare(String o1, String o2){
//                return 1;
//            }
//        });
        int[] clone = a.clone();
        int[] ints = clone;

//        com.guangming.My8_31.MySortController.class.getMethods().in
//        com.guangming.My8_31.te t = new com.guangming.My8_31.te("a","1");
//        Class<?> aClass = t.getClass();
////        Object com.guangming.My8_31.te = aClass.newInstance();
//        Field[] fields = aClass.getdeclaredfields();
//        for (Field f:fields) {
//            System.out.println(f);
//        }
        te t = new te("12","12");
        Class cl = t.getClass();
cl.isArray();
cl.getComponentType();
        cl.getDeclaredField("name").setAccessible(true);
        cl.getDeclaredField("name").set(t,"33");
        System.out.println(cl.getDeclaredField("name").get(t));
        //System.arraycopy();
        String a= "123.2";
        a.endsWith("2");
//        com.guangming.My8_31.testThread t = new com.guangming.My8_31.testThread("A");
//        com.guangming.My8_31.testThread t1 = new com.guangming.My8_31.testThread("B");
//        t1.start();

    }

    public static void InsertSort(int[] a, int n) {
        for (int i = 0; i < n - 1; i++) {
            int tmp = a[i + 1];
            while (i >= 0) {
                if (a[i] > a[i + 1]) {
                    a[i + 1] = a[i];
                    --i;
                } else break;
                a[i + 1] = tmp;
            }
        }
    }

    public static void selectSort(int[] a, int n) {
        int min, i, j, tmp;
        for (i = 0; i < n; i++) {
            min = i;
            for (j = i + 1; j < n; j++) {
                if (a[min] > a[j]) {
                    min = j;
                }
            }
            if (min != i) {
                tmp = a[min];
                a[min] = a[i];
                a[i] = tmp;
            }


        }
    }

    //选择
    static void SelectSort(int[] a, int n) {
        int left = 0;
        int right = n - 1;
        while (left < right) {
            int min = left;  //最小元素
            int max = right;  //最大元素
            for (int i = left; i <= right; i++) {
                if (a[min] > a[i])
                    min = i;
                if (a[max] < a[i])
                    max = i;
            }
            int tmp = a[min];
            a[min] = a[left];
            a[left] = tmp;
            if (max == left)//修正
            {
                max = min;
                System.out.println("111");
                System.out.println(Arrays.toString(a));
            }
            tmp = a[max];
            a[max] = a[right];
            a[right] = tmp;
            ++left;
            --right;
        }
    }

    public static void maoPaoSort(int[] a, int n){
        boolean b = false;
        int c = 0;
        for (int i = 0;i<n-1;i++){
            if (b){
                System.out.println(c);
                return;
            }
            c+=1;
            b = true;
            for (int j = 1;j<n-i;j++){
                if(a[j]<a[j-1]){
                    int tmp = a[j];
                    a[j] = a[j-1];
                    a[j-1] = tmp;
                    b = false;
                }
            }
        }
    }



public static void kuaiSort(int[] a, int n){
//        for (int)
    }
public static void swap(int a,int b){
    int tmp = a;
    a = b;
    b = tmp;

}

    public static void main(String[] args) {
//        System.out.println(m.t());

        int[] i = {1, 2, 3, 4, 5,1,7,3};
        maoPaoSort(i, i.length);
        int min = i[0],max= i[0];
        for (int a:i) {
            if (min > a) min = a;
            if (max<a) max = a;
        }
        System.out.println("min "+min+",max "+max);
        System.out.println(Arrays.toString(Arrays.stream(i).toArray()));
//        m.t();
    }


    public int compareTo(MySortController o) {
    if (getClass()!=o.getClass())throw new ClassCastException();
        return 0;
    }
}

class Mystake<T>{
    Map<String,String> n = new HashMap<String, String>();

    @Override
    public String toString() {
        return "com.guangming.My8_31.Mystake{" +
                "n=" + n +
                ", m=" + m +
                ", t=" + t +
                '}';

//            Field[] fields = com.guangming.My8_31.te.class.getClass().newInstance().getDeclaredFields();
//            for (Field f:fields) {
//                System.out.println(f);
//            }

    }

    Set<Map.Entry<String,String>> m = n.entrySet();

    TreeMap<String,String> t = new TreeMap<String,String>();



}

class te{
    public String name;
    public String age;

    @Override
    public String toString() {
        return "com.guangming.My8_31.te{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    public te(String name, String age) {
        this.name = name;
        this.age = age;
    }





    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
class testThread extends Thread{
    private static int t= 5;

    public testThread(String string) {
        super.setName(string);
    }

    @Override
    public void run() {
        while (true){
                if (t<1)
                    break;
                System.out.println(this.getName()+":"+t--);


        }
    }
}


