package com.jd.pattern.factoryPattern;

/**
 * author:'kaichenr'
 * time:'2018/5/4'
 **/
public class YellowHuman implements Human {
    @Override
    public void laugh() {
        System.out.println("黄人笑");
    }

    @Override
    public void cry() {
        System.out.println("黄人哭");
    }

    @Override
    public void talk() {
        System.out.println("黄人说话");
    }
}
