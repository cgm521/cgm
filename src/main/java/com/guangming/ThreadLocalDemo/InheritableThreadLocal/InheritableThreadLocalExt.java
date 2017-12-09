package com.guangming.ThreadLocalDemo.InheritableThreadLocal;

import java.util.Date;

public class InheritableThreadLocalExt extends InheritableThreadLocal{

    @Override
    protected Object initialValue() {
        System.out.println("进来");
        return "A";
    }
}
