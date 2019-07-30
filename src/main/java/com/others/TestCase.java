/**
 * @Auther: KaiCh
 * @Date: 2019/3/19 17:50
 * @Description:
 */
package com.others;

import org.junit.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
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

    @Test
    public void test4(){
        String str = "20091Q-11";
        str = str.substring(0, str.indexOf("-"));
        System.out.println(str);
    }

    @Test
    public void test5(){
        Map<Object, Object> map = new HashMap<Object, Object>();
        map.put("1", "2323233");
        System.out.println(map.get("1"));
        map.put("1", "65656565");
        System.out.println(map.get("1"));
    }


    @Test
    public void test6(){
        Date date = new Date(System.currentTimeMillis());
        System.out.println(date.getTime());
    }
}
