package com.jdk8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @Author:kaichenr
 * @Date:2018/7/24 10:14
 * @Description: create java.util.stream
 **/
public class StreamCreate {

    public static Stream createStreamFromCollection1() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        return list.stream();
    }

    public static Stream createStreamFromCollection2() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        return list.parallelStream();
    }

    public static Stream createStreamFromArray1() {
        Integer[] integers = {1, 2, 3};
        return Stream.of(integers);
    }

    public static Stream createStreamFromArray2() {
        Integer[] integers = {1, 2, 3};
        return Arrays.stream(integers);
    }

    public static void intStream() {
        IntStream.of(new int[]{1, 2, 3}).forEach(System.out::print);
        IntStream.range(1, 3).forEach(System.out::println);
        IntStream.rangeClosed(1, 3).forEach(System.out::println);
    }

    /**
     * 转大写
     */
    public static void switchUpCase() {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        List<String> stringList = list.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(stringList);
    }


    public static void main(String[] args) {
//        intStream();
        switchUpCase();
    }

}
