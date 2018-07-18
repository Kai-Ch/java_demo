package com.jd.pattern.factoryPattern;

/**
 * author:'kaichenr'
 * time:'2018/5/4'
 **/
public class WhiteHuman implements Human{
    @Override
    public void laugh() {
        System.out.println("白人 笑");
    }

    @Override
    public void cry() {
        System.out.println("白人 哭");
    }

    @Override
    public void talk() {
        System.out.println("白人 说话");
    }
}
