package com.guangming.Dome;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by cgm on 2017/10/19.
 */
public class CglibProFactory implements MethodInterceptor {
    private Object tager;

    public CglibProFactory(Object tager) {
        this.tager = tager;
    }

    public Object getIns() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(tager.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("----------");
        Object invoke = methodProxy.invokeSuper(o, objects);
        System.out.println("++++++++++");
        return invoke;
    }
}
