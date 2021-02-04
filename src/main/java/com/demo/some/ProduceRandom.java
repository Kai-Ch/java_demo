package com.demo.some;

import java.util.Random;

/**
 * @Author:kaichenr
 * @Date:2018/7/19 17:38
 **/
public class ProduceRandom {
    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            int Min = 5;

            int Max = 10;

//            int result = (int)(Math.random() * ((90 - 61) + 1));
//            System.out.println(result);
            //61-90
            int a = r.nextInt(29)+61;
            System.out.println(a);
        }
    }


    public void createRangeRandom(){
        int Max = 1;
        int Min = 0;
        int result = (int)(Math.random()*((Max-Min)+1));
    }
}
