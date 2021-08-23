package com.demo.jd.superior.map;

import com.demo.util.GsonUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Author:kaichenr
 * @Date:2018/7/25 9:44
 * @Description:
 **/
public class MapDemo {

    private final Logger LOG = LoggerFactory.getLogger(MapDemo.class);

    public void cycle(){
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("1", 11111);
        map.put("2", 22222);
        map.put("3", 33333);

        Set<Map.Entry<String, Object>> set = map.entrySet();
        System.out.println(set);

        Set<String> keys = map.keySet();
        LOG.info("keys:{}", GsonUtil.GsonString(keys));
    }

    public static void main(String[] args) {
        MapDemo mapDemo = new MapDemo();
        mapDemo.cycle();
    }
}
