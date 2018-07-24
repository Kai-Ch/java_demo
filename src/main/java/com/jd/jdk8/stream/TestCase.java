package com.jd.jdk8.stream;

import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author:kaichenr
 * @Date:2018/7/24 15:32
 * @Description:
 **/
public class TestCase {

    @Test
    public void createAnimal(){
        String[] weeks = {"monday", "tuesday", "wednesday", "", "thursday", "friday", "saturday", "sunday"};
        List<String> list1 = Stream.of(weeks).filter(String::isEmpty).collect(Collectors.toList());
        System.out.println(list1.size());
    }
}
