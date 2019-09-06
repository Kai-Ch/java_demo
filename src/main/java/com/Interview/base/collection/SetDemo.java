package com.Interview.base.collection;

import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

    private final static Logger log = LoggerFactory.getLogger(SetDemo.class);

    public Set treeSetInit(){
        Set<Object> set = new TreeSet<Object>();
        set.add(null);
        set.add(null);
        set.add(1);
        set.add("hello");
        set.add(2);
        log.info("set.size:{}", set.size());
        return set;
    }

    public Set hashSetInit(){
        Set<Object> set = new HashSet<Object>();
        set.add(null);
        set.add(null);
        set.add(1);
        set.add("hello");
        set.add(2);
        log.info("set.size:{}", set.size());
        return set;
    }

    public static void main(String[] args) {
//        Set set = new SetDemo().treeSetInit();
        Set set = new SetDemo().hashSetInit();
        set.stream().forEach(e ->{
            log.info("e:{}", e);
        });

    }

    @Test
    public void initSet(){
        SetDemo setDemo = new SetDemo();
        Set set = setDemo.hashSetInit();
        log.info("set:{}", JSON.toJSONString(set));
    }
}
