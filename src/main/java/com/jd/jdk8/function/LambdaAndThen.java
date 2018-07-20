package com.jd.jdk8.function;

import java.util.function.Function;

/**
 * @Author:kaichenr
 * @Date:2018/7/20 15:40
 **/
public class LambdaAndThen {
    public static void main(String[] args) {

        /**
         * Function<T,R>
         * 接受一个输入参数T，返回一个结果R
         */
        Function<Integer, Integer> square = i -> i * i;
        Function<Integer, Integer> times = i -> i * 2;

        System.out.println(square.apply(5));
        System.out.println(times.apply(5));

        times.compose(square).apply(3); // 顺序 3*3=9   9*2
        System.out.println(times.compose(square).apply(3));

        times.andThen(square).apply(4); // 顺序 4*2=8  8*8
        System.out.println(times.andThen(square).apply( 4));

    }
}
