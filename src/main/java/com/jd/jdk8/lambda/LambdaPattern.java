package com.jd.jdk8.lambda;

import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;

import java.util.Comparator;
import java.util.function.Consumer;

/**
 * @Author:chenkai
 * @description: lambda语法格式
 * @Date:2019/11/14 22:40
 */
@Slf4j
public class LambdaPattern {

    @Before
    public void setUp() {

    }

    /**
     * 无参数，无返回值
     */
    @Test
    public void test1() {
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("run !!!!");
            }
        };
        r1.run();

        Runnable r2 = () -> {
            System.out.println("hello lambda");
        };
        r2.run();
    }

    /**
     * 需要一个参数，但是没有返回值
     */
    @Test
    public void test2() {
        Consumer<String> con = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        con.accept("hello");

        Consumer<String> consumer = (s) -> {
            System.out.println(s);
        };
        consumer.accept("lambda");
    }

    /**
     * 数据类型可以省略，因为可由编译器退出，称为“类型推断”
     */
    @Test
    public void test3() {
        Consumer consumer = (s) -> {
            System.out.println(s);
        };
        consumer.accept("lambda");
    }

    /**
     * 当lambda的形参只有一个时，()也可以省略
     */
    @Test
    public void test4() {
        Consumer consumer = s -> {
            System.out.println(s);
        };
        consumer.accept("lambda");
    }

    /**
     * lambda需要两个以上的参数，多条执行语句，并且有返回值
     */
    @Test
    public void test5() {
        Comparator<Integer> comparator = (o1, o2) -> {
            System.out.println(o1);
            System.out.println(o2);
            return o1.compareTo(o2);
        };
    }

    /**
     * 当lambda只有一条语句时，return与大括号都有，可以省略
     */
    @Test
    public void test6() {
        Comparator<Integer> comparator = (o1, o2) -> o1.compareTo(o2);
    }

}
