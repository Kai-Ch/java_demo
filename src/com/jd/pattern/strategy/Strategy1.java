package com.jd.pattern.strategy;

/**
 * author:'kaichenr'
 * time:'2018/5/3'
 **/
public class Strategy1 implements IStrategy{
    @Override
    public void operate() {
        System.out.println("使用策略 1");
    }
}
