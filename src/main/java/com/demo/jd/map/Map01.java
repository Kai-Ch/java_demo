/**
 * @Auther: KaiCh
 * @Date: 2018/12/14 10:47
 * @Description:
 */
package com.demo.jd.map;

import java.util.HashMap;
import java.util.Map;

public class Map01 {

    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<String, Object>();

        map.put("1:", 1);
        map.put("2:", 2);
        map.put("3:", 3);

//        for (Map.Entry entry : map.entrySet()){
//            System.out.println(entry);
//        }

//        Iterator iterator = map.entrySet().iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
        int value = (int) map.get("1:");
        System.out.println(value);
    }
}
