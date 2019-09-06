package com.Interview.base.collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

public class ListSortDemo {

    private final static Logger log = LoggerFactory.getLogger(ListSortDemo.class);

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(4);
        list.add(2);
        list.add(1);
        // list.sort
//        list.sort(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                if(o1 > o2){
//                    return -1;
//                }else if( o1 < o2){
//                    return 1;
//                }else {
//                    return 0;
//                }
//            }
//        });

//        Collections.sort(list, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                if (o1 > o2) {
//                    return -1;
//                } else if (o1 < o2) {
//                    return 1;
//                } else {
//                    return 0;
//                }
//            }
//        });

        Collections.sort(list);
        Collections.reverse(list);

        log.info("list:{}", list);
    }
}
