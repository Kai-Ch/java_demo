package com.Interview.base.collection;

import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

public class MapDemo {

    private final static Logger log = LoggerFactory.getLogger(SetDemo.class);

    public Map hashMapInit(){
        Map<Object, Object> map = new HashMap<>();
        map.put("key1", 1);
        map.put("2", 3);
        map.put(null, null);
        map.put(null, null);
        log.info("list.size:{}", map.size());
        return map;
    }

    public Map treeMapInit(){
        Map<Object, Object> map = new TreeMap<>();
        map.put("key1", 1);
        map.put("2", 3);
        map.put(null, null);
        map.put(null, null);
        log.info("list.size:{}", map.size());
        return map;
    }

    public static void main(String[] args) {
        Map<Object, Object> map = new MapDemo().hashMapInit();
//        Map<Object, Object> map = new MapDemo().treeMapInit();
        // 1. 使用lamdea遍历
        map.forEach((k,v)->{
            log.info("key:{},value:{}",k,v);
        });

        // 2.使用for循环
        for(Map.Entry<Object, Object> e : map.entrySet()){
            log.info("key:{},value:{}",e.getKey(),e.getValue());
        }

        // 3.迭代器
        Iterator<Map.Entry<Object, Object>> it = map.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry entry = it.next();
            log.info("k :{}, value :{}", entry.getKey(), entry.getValue());
        }

//         4.分别遍历key，value
        for(Object key : map.entrySet()){
            log.info("key:{}", key);
        }
        for(Object value : map.values()){
            log.info("value:{}", value);
        }
//         5.增强for
        for(Object e : map.keySet()){
            log.info("{} = {}", e, map.get(e));
        }
    }

    @Test
    public void initMap(){
        MapDemo mapDemo = new MapDemo();
        Map map = mapDemo.treeMapInit();
        log.info("map:{}", JSON.toJSONString(map));
    }
}
