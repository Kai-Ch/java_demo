/**
 * @Auther: KaiCh
 * @Date: 2019/3/19 17:50
 * @Description:
 */
package com.others;

import org.junit.Test;

import java.util.UUID;

public class TestCase {

    private final String wld = "20010";

    @Test
    public void test1(){
        if(!Wld.SUV_TZXSX.value().equals(wld) && !Wld.MPV_TZXSX.value().equals(wld)){
            System.out.println("过点");
        }else {
            System.out.println("不过点");
        }
    }

    @Test
    public void test2(){
        String str = UUID.randomUUID().toString().replaceAll("-", "");
        System.out.println(str);
    }

    @Test
    public void test3(){
        String str = "20090-61";
        str = str.substring(0, 5);
        System.out.println(str);
    }
}
