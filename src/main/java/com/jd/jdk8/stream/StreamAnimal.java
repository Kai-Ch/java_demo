package com.jd.jdk8.stream;

import com.jd.utils.GsonUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

import static java.awt.Color.darkGray;
import static java.awt.Color.orange;

/**
 * @Author:kaichenr
 * @Date:2018/7/20 17:11
 **/
public class StreamAnimal {
    public static void main(String[] args) {
        List<Animal> list = new ArrayList<Animal>();
        Animal tiger = new Animal("tiger", orange, 1000);
        Animal dog1 = new Animal("dog1", darkGray, 500);
        Animal dog2 = new Animal("dog2", orange, 500);
        list.add(tiger);
        list.add(dog1);
        list.add(dog2);
        int sum = list.stream().filter(e -> e.getCoatColor() == orange).mapToInt(e -> e.getValue()).sum();
        OptionalDouble average = list.stream().filter(e -> e.getCoatColor() == orange).mapToInt(e -> e.getValue()).average();
        System.out.println(sum);
        System.out.println(average.getAsDouble());  //转成double类型

        
        List<Animal> animals = list.stream().filter(e -> e.getCoatColor() == orange).collect(Collectors.toList());
        System.out.println(GsonUtil.GsonString(animals));



    }
}
