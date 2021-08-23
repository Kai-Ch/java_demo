package com.demo.jd.data.disperse;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author:kaichenr
 * @Date:2018/7/31 11:20
 * @Description:
 **/
public class ListTest {

    @Test
    public void listTest() {
        List<Integer> list1 = new LinkedList<>();
        list1.add(1);
        list1.add(3);
        list1.add(5);

        List<Integer> list2 = new LinkedList<>();
        list2.add(5);
        list2.add(3);
        list2.add(1);

        System.out.println(list1 == list2);
    }

    @Test
    public void listTest2() {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(3);
        list1.add(5);

        List<Integer> list2 = new ArrayList<>();
        list2.add(5);
        list2.add(3);
        list2.add(1);

        System.out.println(list1 == list2);

    }

}
