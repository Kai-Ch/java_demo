package com.demo.jd.pattern.poxy;

/**
 * author:'kaichenr'
 * time:'2018/5/3'
 **/
public class SecondMan {
    public static void main(String[] args) {
        SecondWomen secondWomen = new SecondWomen();
        PoxyPeople poxyPeople = new PoxyPeople(secondWomen);
        poxyPeople.makeEyesWithMan();
        poxyPeople.doSomething();
    }
}
