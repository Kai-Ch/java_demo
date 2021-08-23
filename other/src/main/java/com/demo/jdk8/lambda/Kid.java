package com.demo.jdk8.lambda;

/**
 * @Author:kaichenr
 * @Date:2018/7/18 18:17
 **/
public class Kid extends Person implements Comparable<Kid> {

    @Override
    public int compareTo(Kid o) {
        if(this.getAge() > o.getAge()){
            return 1;
        }else if(this.getAge() < o.getAge()){
            return -1;
        }else {
            return 0;
        }
    }

    public Kid(String name, int age) {
        super(name, age);
    }

    public Kid() {
    }
}
