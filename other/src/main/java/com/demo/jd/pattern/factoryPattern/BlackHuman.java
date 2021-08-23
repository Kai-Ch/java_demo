package com.demo.jd.pattern.factoryPattern;

/**
 * author:'kaichenr'
 * time:'2018/5/4'
 **/
public class BlackHuman implements Human {
    @Override
    public void laugh() {
        System.out.println("黑人笑");
    }

    @Override
    public void cry() {
        System.out.println("黑人哭");
    }

    @Override
    public void talk() {
        System.out.println("黑人说话");
    }
}
