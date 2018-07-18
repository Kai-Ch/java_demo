package com.jd.pattern.factoryPattern;

/**
 * author:'kaichenr'
 * time:'2018/5/4'
 **/
public class NvWa {
    public static void main(String[] args) {
        Human whiteHuman = FactoryHuman.createHuman(WhiteHuman.class);
        whiteHuman.laugh();
        whiteHuman.cry();
        whiteHuman.talk();
    }
}
