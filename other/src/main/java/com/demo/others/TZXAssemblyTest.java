/**
 * @Auther: KaiCh
 * @Date: 2019/3/4 14:41
 * @Description:
 */
package com.demo.others;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TZXAssemblyTest {

    private TZXAssembly tzxAssembly = TZXAssembly.getInstance();

    @Test
    public void test1(){
        int num = tzxAssembly.getReSend().incrementAndGet();
        System.out.println(num);

        int queueOrder = tzxAssembly.getQueueOrder().get();
        System.out.println(tzxAssembly.getQueueOrder().incrementAndGet());
    }


    @Test
    public void test2(){
        String str = "SR200000012";
        str = str.substring(3);
        System.out.println(str);
    }

    @Test
    public void  test3(){
        String str = "B+PLC+A+LK5E3D1W1JA1512350+E";
        str = str.substring(25,26);
        System.out.println(str);
    }

    @Test
    public void test4(){
        String str = "B+PLC+A+LK5E3D1W1JA151266+E";
        str = str.substring(8, 25);
        System.out.println(str);
    }

    @Test
    public void test5(){
        Map<String, List> map = new HashMap<String, List>();
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);

        map.put("list", list);

        List<Integer> list1 = map.get("list");
        list1.add(3);

        List<Integer> list2 = map.get("list");
        System.out.println(list2);
    }



}
