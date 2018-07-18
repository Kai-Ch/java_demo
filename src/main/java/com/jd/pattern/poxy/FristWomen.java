package com.jd.pattern.poxy;

/**
 * author:'kaichenr'
 * time:'2018/5/3'
 **/
public class FristWomen implements KindWomen {
    @Override
    public void makeEyesWithMan() {
        System.out.println("first makeEyesWithMan");
    }

    @Override
    public void doSomething() {
        System.out.println("first doSomething");
    }
}
