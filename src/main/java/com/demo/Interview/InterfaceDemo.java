package com.demo.Interview;

import org.junit.Test;

public class InterfaceDemo implements InterfaceDemo1{

    @Test
    public void test1(){
        InterfaceDemo interfaceDemo = new InterfaceDemo();
        System.out.println(InterfaceDemo1.a);
    }

}
