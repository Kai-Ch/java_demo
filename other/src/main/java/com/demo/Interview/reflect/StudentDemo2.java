package com.demo.Interview.reflect;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class StudentDemo2 {

    private final static Logger log = LoggerFactory.getLogger(StudentDemo2.class);

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, InvocationTargetException {
        Class clazz = Class.forName("com.demo.Interview.reflect.Student");
        Student student = (Student) clazz.newInstance();
        //获取内部类
        Class[] c = clazz.getClasses();
        System.out.println("内部类数量：" + c.length);

        // 获取构造方法
        Constructor[] constructors = clazz.getConstructors();
        System.out.println("构造方法数量：" + constructors.length);
        for (Constructor constructor : constructors){
            System.out.println("构造方法修饰符:" + Modifier.toString(constructor.getModifiers()));
            System.out.println("构造方法名:" +constructor.getName());
        }

        // 获取方法
        Method[] methods = clazz.getMethods();
        for (Method method : methods){
            System.out.println("方法名:" + method.getName());
        }

        // 创建对象
        Constructor constructor = constructors[1];
        Class[] cParameters = constructor.getParameterTypes();
        for(Class cParameter : cParameters){
            System.out.println(cParameter.getTypeName());
        }

        Object object = constructor.newInstance("张三", 18);
        System.out.println(object);
    }
}
