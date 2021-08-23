package com.demo.Interview.base.collection;

import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListDemo {

    private final static Logger log = LoggerFactory.getLogger(ListDemo.class);

    public List arrayListInit(){
        List<Object> list = new ArrayList<Object>();
        list.add(1);
        list.add("hello");
        list.add(null);
        list.add(null);
        log.info("list.size:{}", list.size());
        return list;
    }

    public List linkedListInit(){
        List<Object> list = new LinkedList<>();
        list.add(1);
        list.add("hello");
        list.add(null);
        list.add(null);
        log.info("list.size:{}", list.size());
        return list;
    }

    public Vector vectorInit(){
        Vector<Object> vector = new Vector<Object>();
        vector.add(1);
        vector.add("hello");
        vector.add(null);
        vector.add(null);
        log.info("list.size:{}", vector.size());
        return vector;
    }

    public static void main(String[] args) {
        List<Object> list = new ListDemo().arrayListInit();
//        List<Object> list = new ListDemo().linkedListInit();
//        list.stream().forEach(e ->{
//            log.info("e:{}", e);
//        });

//        Vector<Object> vector = new ListDemo().vectorInit();
//        vector.stream().forEach(e ->{
//            log.info("e:{}", e);
//        });


    }

    @Test
    public void initList(){
        ListDemo listDemo = new ListDemo();
        List list = listDemo.vectorInit();
        log.info("list:{}", JSON.toJSONString(list));
    }
}
