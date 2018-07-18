package com.jd.pattern.MultitionPattern;

/**
 * author:'kaichenr'
 * time:'2018/5/3'
 **/
public class Minister {
    public static void main(String[] args) {

        int nimisterNum = 10;

        for (int i = 0; i < nimisterNum; i++) {
            Emperor emperor = Emperor.getEmperor();
            System.out.println("第"+(i+1)+"次");
            emperor.getName();
        }
    }
}
