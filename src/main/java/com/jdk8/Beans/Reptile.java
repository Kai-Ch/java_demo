package com.jdk8.Beans;

/**
 * @Author:kaichenr
 * @Date:2018/7/19 17:19
 **/
public class Reptile extends Animal{
    private double bodyLength;

    public double getBodyLength() {
        return bodyLength;
    }

    public void setBodyLength(double bodyLength) {
        this.bodyLength = bodyLength;
    }

    public Reptile(String name, double bodyLength) {
        this.setName(name);
        this.bodyLength = bodyLength;
    }
}
