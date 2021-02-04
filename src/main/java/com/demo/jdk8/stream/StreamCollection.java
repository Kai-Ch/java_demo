package com.demo.jdk8.stream;

import com.demo.util.Constant;
import com.demo.util.GsonUtil;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author:kaichenr
 * @Date:2018/7/24 14:39
 * @Description:
 **/
public class StreamCollection {

    static String[] weeks = {"monday", "tuesday", "wednesday", "", "thursday", "friday", "saturday", "sunday"};

    static List<String> weekList;

    static {
        weekList = Arrays.asList(weeks);
    }

    public void arrayToCollections() {
        List<String> list1 = Stream.of(weeks).filter(StringUtils::isNotEmpty).collect(Collectors.toList());
        System.out.println(GsonUtil.GsonString(list1));
    }

    public void arrayToCollections2() {
        List<String> list = Arrays.stream(weeks).filter(StringUtils::isNotEmpty).collect(Collectors.toCollection(LinkedList::new));
        System.out.println(GsonUtil.GsonString(list));
    }

    public void collectionNum(){
        int a = weekList.stream().filter(StringUtils::isNotEmpty).mapToInt(Constant::getIntegerOne).sum();
        System.out.println(a);
    }

    public static void main(String[] args) {
        StreamCollection streamCollection = new StreamCollection();
//        streamCollection.arrayToCollections();
//        streamCollection.arrayToCollections2();
        streamCollection.collectionNum();

    }
}
