package com.guangming.Dome;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by cgm on 2017/9/28.
 */
public class Dome {
    static class Human {

        public String sayHello(Dome.Human human) {
            return "你好";
        }

        public String sayHello(Dome.Man human) {
            return "您好,先生";
        }

        public String sayHello(Dome.Woman human) {
            return "您好,美女";
        }

       /* public String sayHello(Dome.Girl human) {
            return "您好,美少女";
        }*/
    }

    static class Man extends Dome.Human {

        public String sayHello(Dome.Human human) {
            return "你好,我是Y先生";
        }

        public String sayHello(Dome.Woman human) {
            return "您好,美女,我是Y先生";
        }

        public String sayHello(Dome.Girl human) {
            return "您好,美少女,我是Y先生";
        }

        // 先生对先生比较谨慎,没那么快介绍自己 =。=
    }

    static class Woman extends Dome.Human {

        public String sayHello(Dome.Human human) {
            return "你好,我是X美女";
        }

        public String sayHello(Dome.Woman human) {
            return "您好,美女,我是X美女";
        }

        public String sayHello(Dome.Girl human) {
            return "您好,美少女,我是X美女";
        }

        // 美女对先生比较含蓄,没那么快介绍自己 =。=
    }

    static class Girl extends Dome.Woman {

        public String sayHello(Dome.Human human) {
            return "你好,我是O美少女";
        }

    }

    static class MinGirl extends Dome.Girl {
        public String sayHello(Dome.Human human) {
            return "你好,我是O小美少女";
        }
    }

    public static void main(String[] args) {
        //动态绑定
        Dome.Human manAsGuy = new Dome.Man();
        Dome.Girl girl = new Dome.Girl();
        System.out.println(manAsGuy.sayHello(girl));

        String a = "qwe,qwe,qwe,ert,sfd,asd,wef,we,f,sd,f,sdf,w,ef,qw,d,q,w,df,f,we,ef,wef,wef";
        String[] strings = a.split(",");
        Arrays.parallelSort(strings, Comparator.comparing(String::length));
        System.out.println(Arrays.toString(strings));
        System.out.println("---------------");
        int i[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Arrays.parallelPrefix(i,(x,y)-> x*y);
        System.out.println(Arrays.toString(i));

    }
}
