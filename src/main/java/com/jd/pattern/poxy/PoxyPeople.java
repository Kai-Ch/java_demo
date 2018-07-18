package com.jd.pattern.poxy;

/**
 * author:'kaichenr'
 * time:'2018/5/3'
 **/
public class PoxyPeople implements KindWomen{
    private KindWomen kindWomen;

    public PoxyPeople(){
        this.kindWomen = new FristWomen();
    }

    public PoxyPeople(KindWomen kindWomen){
        this.kindWomen = kindWomen;
    }

    @Override
    public void makeEyesWithMan() {
        this.kindWomen.makeEyesWithMan();
    }

    @Override
    public void doSomething() {
        this.kindWomen.doSomething();
    }
}
