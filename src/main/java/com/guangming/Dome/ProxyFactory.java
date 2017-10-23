package com.guangming.Dome;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by cgm on 2017/10/19.
 * 动态代理工厂
 */
public class ProxyFactory {
    private Object tager;

    public ProxyFactory(Object tager) {
        this.tager=tager;
    }

    public Object getIns() {
        return Proxy.newProxyInstance(tager.getClass().getClassLoader(),
                tager.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("--------");
                        Object invoke = method.invoke(tager, args);
                        System.out.println("++++++++++");
                        return invoke;
                    }
                });
    }
}
