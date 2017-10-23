package com.guangming.No_14;

import java.lang.annotation.*;

/**
 * Created by cgm on 2017/9/26.
 */
@Retention( RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface MyAnnotation {
    String name() default "jiajun";
}
public class MyAnnotations {
    public static void main(String[] args) {
        Test test = new Test();
        Class testClass = test.getClass();
        MyAnnotation annotation1 = (MyAnnotation) testClass.getAnnotation(MyAnnotation.class);
        System.out.println(annotation1.name());
        System.out.println("--------");
        Class clazz = Test.class;
        Annotation[] annotations = clazz.getAnnotations();
        for(Annotation annotation : annotations){
            if(annotation instanceof MyAnnotation){
                MyAnnotation myAnnotation = (MyAnnotation) annotation;
                System.out.println("name: " + myAnnotation.name());
            }
        }
    }
}

@MyAnnotation(name="jiajun11")
class Test {
}
