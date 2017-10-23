package com.guangming.No_14;

import java.lang.annotation.*;
import java.lang.reflect.Method;

/**
 * Created by cgm on 2017/9/26.
 */
@Retention( RetentionPolicy.RUNTIME)
@Target(ElementType.PARAMETER)
@interface MyAnnotation1 {
    String name() default "jiajun";
}
class Test1 {
    public static void doSomething(
            @MyAnnotation1(name="jiajun") String parameter){
    }
}
class Demo {
    public static void main(String[] args) {
        Class clazz=Test1.class;
        Method[]  methods=clazz.getMethods();
        for(Method method :methods)
        {
            if(method.getName()=="doSomething")
            {
                Annotation[][] parameterAnnotations = method.getParameterAnnotations();
                Class[] parameterTypes = method.getParameterTypes();

                int i=0;
                for(Annotation[] annotations : parameterAnnotations){
                    Class parameterType = parameterTypes[i++];

                    for(Annotation annotation : annotations){
                        if(annotation instanceof MyAnnotation1){
                            MyAnnotation1 myAnnotation = (MyAnnotation1) annotation;
                            System.out.println("param: " + parameterType.getName());
                            System.out.println("name : " + myAnnotation.name());
                        }
                    }
                }
            }
        }
    }
}
