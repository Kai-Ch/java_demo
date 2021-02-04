package com.jdk8.lambda;

import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author:chenkai
 * @description:
 * @Date:2019/11/14 22:40
 */
@Slf4j
public class Lambda1 {

    @Before
    public void setUp(){

    }

    @Test
    public void test1(){
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("run !!!!");
            }
        };
        r1.run();

        Runnable r2 = () ->{
            System.out.println("hello lambda");
        };
        r2.run();

    }

    @Test
    public void test2(){
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("lambda");
        list.add("demo");
        list.add("test");

        String result = list.stream().collect(Collectors.joining(""));
        log.info("result{}", result);
    }
}
