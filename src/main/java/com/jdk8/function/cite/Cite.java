package com.jdk8.function.cite;

import com.jd.utils.GsonUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * @Author:kaichenr
 * @Date:2018/7/24 16:12
 * @Description: function cite
 **/
public class Cite {

    public void citeCompareTo() {
        List<Integer> list = new ArrayList<Integer>();
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(r.nextInt(100));
        }
        Collections.sort(list, (o1, o2) -> o1 > o2 ? -1 : o1 == o2 ? -1 : 1);
        System.out.println(GsonUtil.GsonString(list));

        Collections.sort(list, Integer::compareTo);
        System.out.println(GsonUtil.GsonString(list));
    }

    public static void main(String[] args) {
        Cite cite = new Cite();
        cite.citeCompareTo();
    }
}
