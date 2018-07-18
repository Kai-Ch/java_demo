package com.some;

import com.jd.utils.GsonUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * author:'kaichenr'
 * time:'2018/5/11'
 **/
public class Some1 {
    public static void main(String[] args) {
        String ids1 = "0cef53f3e5694d9ba682849f8d1d7f4e";
        String ids2 = "0cef53f3e5694d9ba682849f8d1d7f4e-6cdc892c409247f088b126c85453504b";

        List<String> list = new ArrayList<String>();
        String[] stringArray = ids1.split("-");
        for (String str : stringArray) {
            list.add(str);
        }

        System.out.println(GsonUtil.GsonString(list));
    }
}
