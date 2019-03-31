package com.some;

import java.util.Random;

public class Ran {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt(10);
        System.out.println(num);
    }
}
