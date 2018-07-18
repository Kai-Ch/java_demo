package com.jd.pattern.strategy;

/**
 * author:'kaichenr'
 * time:'2018/5/3'
 **/
public class Context {

    private IStrategy iStrategy;

    public Context(IStrategy iStrategy){
        this.iStrategy = iStrategy;
    }

    public void operate(){
        iStrategy.operate();
    }
}
