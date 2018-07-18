package com.jd.pattern.singleton;

/**
 * author:'kaichenr'
 * time:'2018/5/3'
 **/
public class Minister1 {
    public static void main(String[] args) {

        Emperor emperor = Emperor.getEmperor();
        Emperor emperor1 = Emperor.getEmperor();

        System.out.println(emperor == emperor1);
    }
}
