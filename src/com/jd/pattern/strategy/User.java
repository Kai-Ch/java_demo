package com.jd.pattern.strategy;

/**
 * author:'kaichenr'
 * time:'2018/5/3'
 **/
public class User {
    public static void main(String[] args) {
        System.out.println("1");
        new Context(new Strategy1()).operate();
        System.out.println("2");
        new Context(new Strategy2()).operate();
        System.out.println("3");
        new Context(new Strategy3()).operate();
    }
}
