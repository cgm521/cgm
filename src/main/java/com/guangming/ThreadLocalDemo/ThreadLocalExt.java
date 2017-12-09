package com.guangming.ThreadLocalDemo;

import java.util.Date;

class ThreadLocalExt extends ThreadLocal {

    @Override
    protected Object initialValue() {
        return new Date().getTime();
    }
}
