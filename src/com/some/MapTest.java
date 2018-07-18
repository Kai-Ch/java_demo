package com.some;

import org.apache.commons.collections.MapUtils;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * description:
 * author:'kaichenr'
 * time:'2018/6/27'
 **/
public class MapTest {

    @Test
    public void map1Test(){
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("1","222");
        Object name = map.get("name");
        System.out.println(name);
        String age = MapUtils.getString(map, "age");
        System.out.println(age);
    }
}
