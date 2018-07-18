package com.jd.pattern.poxy;

/**
 * author:'kaichenr'
 * time:'2018/5/3'
 **/
public class SecondWomen implements KindWomen{

    @Override
    public void makeEyesWithMan() {
        System.out.println("second makeEyesWithMan");
    }

    @Override
    public void doSomething() {
        System.out.println("second do something");
    }
}
