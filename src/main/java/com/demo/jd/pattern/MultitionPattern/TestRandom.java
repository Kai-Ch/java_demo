package com.demo.jd.pattern.MultitionPattern;

import java.util.Random;

/**
 * author:'kaichenr'
 * time:'2018/5/4'
 **/
public class TestRandom {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int countNum = random.nextInt(2);
            System.out.println(countNum);
        }
    }
}
