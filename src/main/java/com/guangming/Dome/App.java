package com.guangming.Dome;

/**
 * Created by cgm on 2017/10/19.
 */
public class App {
    public static void main(String[] args) {
        UserDao userDao = new UserDaoImpl();
        UserDao ins = (UserDao) new ProxyFactory(userDao).getIns();
        ins.save();
        System.out.println("@@@@@@@@@@@@@@@@");

        StutentDao stutent = new StutentDao();
        StutentDao cg = (StutentDao) new  CglibProFactory(stutent).getIns();
        cg.save();
    }
}
