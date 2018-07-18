package com.jd.pattern.poxy;

/**
 * author:'kaichenr'
 * time:'2018/5/3'
 **/
public class FirstMan {
    public static void main(String[] args) {
        PoxyPeople poxyPeople = new PoxyPeople();
        poxyPeople.makeEyesWithMan();
        poxyPeople.doSomething();
    }
}
