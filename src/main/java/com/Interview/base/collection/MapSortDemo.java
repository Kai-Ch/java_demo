package com.Interview.base.collection;

import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

/**
 * @Author:chenkai
 * @description: 对map进行排序
 * @Date:2019/8/30 0:40
 */
public class MapSortDemo {

    private final static Logger log = LoggerFactory.getLogger(MapSortDemo.class);

    public Map hashMapInit(){
        Map<String, MapSortDemoBean> map = new HashMap<String, MapSortDemoBean>();
        map.put("key2", new MapSortDemoBean(2, "唐僧", 400));
        map.put("key1", new MapSortDemoBean(1, "熏悟空", 3300));
        map.put("key4", new MapSortDemoBean(4, "虾悟净", 2400));
        map.put("key3", new MapSortDemoBean(3, "如来", 4400));
        log.info("list.size:{}", map.size());
        return map;
    }

    public static void main(String[] args) {
        Map<String, MapSortDemoBean> map = new MapSortDemo().hashMapInit();
        map.forEach((k,v)->{
            log.info("key:{}=value:{}",k, JSON.toJSONString(v));
        });

        // 将map转换成List<Map.Entry> 进行排序
        Set<Map.Entry<String, MapSortDemoBean>> set = map.entrySet();
        log.info("排序前set:{}", JSON.toJSONString(set));

        List<Map.Entry<String, MapSortDemoBean>> list = new ArrayList(set);
        log.info("排序前list:{}", JSON.toJSONString(list));

        Collections.sort(list, new Comparator<Map.Entry<String, MapSortDemoBean>>() {
            @Override
            public int compare(Map.Entry<String, MapSortDemoBean> o1, Map.Entry<String, MapSortDemoBean> o2) {
                if(o1.getValue().getId() > o2.getValue().getId()){
                    return -1;
                }else {
                    return 1;
                }
            }
        });

        log.info("排序后list:{}", JSON.toJSONString(list));

        // 对排序好的list重新封装成map
        Map<String, MapSortDemoBean> newMap = new LinkedHashMap<>();
        for(Map.Entry<String, MapSortDemoBean> e : list){
            newMap.put(e.getKey(), e.getValue());
        }

        log.info("排序后的map：{}", JSON.toJSONString(newMap));
    }
}
