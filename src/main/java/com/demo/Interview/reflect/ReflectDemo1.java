package com.demo.Interview.reflect;

import org.junit.Test;

public class ReflectDemo1 {

    @Test
    public void test1() throws ClassNotFoundException {
        PerSon p1 = new PerSon();
        Class c1 = p1.getClass();
        Class c2 = PerSon.class;
        Class c3 = Class.forName("com.demo.Interview.reflect.PerSon");
        System.out.println(c1 == c2);
        System.out.println(c1 == c3);
    }

    @Test
    public void test2(){
        Class c = PerSon.class;
    }

    @Test
    public void test3() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class c = Class.forName("com.demo.Interview.reflect.PerSon");
        c.newInstance();
    }
}
