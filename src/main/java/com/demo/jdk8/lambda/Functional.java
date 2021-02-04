package com.demo.jdk8.lambda;

import org.junit.Before;
import org.junit.Test;

/**
 * @Author:chenkai
 * @description:
 * @Date:2019/11/18 23:20
 */
public class Functional {

    @Before
    public void seUp(){

    }

    @Test
    public void test(){
        MyFunctional<String> myFunctional = e -> System.out.println(e);
        myFunctional.accept("lambda");
    }
}
