package com.guangming.My8_31;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

/**
 * Created by cgm on 2017/8/31.
 * 代理
 */
public class MyProxy implements InvocationHandler{

    private static Logger logger = LoggerFactory.getLogger(MyProxy.class);

//    private static final java.util.logging.Logger getLogger = java.util.logging.Logger.getLogger("");

    public MyProxy(Object target) {
        this.target = target;
    }

    private Object target;

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws InvocationTargetException, IllegalAccessException {
        System.out.println(target+"."+method.getName());
        return method.invoke(target, args);
    }

    public static void main(String[] args) {
        Class[] inter = new Class[]{Comparable.class};
        int[] a = {1, 2, 3, 4, 5, 6,};
        for (int i:a){

            Object o = Proxy.newProxyInstance(null, inter, new MyProxy(i));
            Class<?> proxyClass = Proxy.getProxyClass(null, inter);
            proxyClass.toString();
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            for (StackTraceElement stackTraceElement:stackTrace){
                System.out.println(stackTraceElement);
            }
            System.out.println(Proxy.isProxyClass(proxyClass));
        }
        assert true;
        Map<Thread, StackTraceElement[]> map = Thread.getAllStackTraces();
        Set<Thread> threads =  map.keySet();
        try {
            System.out.println(Arrays.binarySearch(new int[]{1, 1, 2, 4, 5, 5, 6}, 2));
            logger.info("132");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
