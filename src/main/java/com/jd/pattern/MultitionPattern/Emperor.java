package com.jd.pattern.MultitionPattern;

import java.util.ArrayList;
import java.util.Random;

/**
 * author:'kaichenr'
 * time:'2018/5/3'
 **/
public class Emperor {
    //皇帝最大数量
    private static int maxNumEmperor = 2;

    //皇帝名字
    private static ArrayList emperorNameList = new ArrayList(maxNumEmperor);

    //皇帝
    private static ArrayList emperorList = new ArrayList(maxNumEmperor);

    private static int countNum;

    static {
        for (int i = 0; i < maxNumEmperor; i++) {
            emperorList.add(new Emperor("皇帝"+(i+1)));
        }
    }

    //私有化构造器
    private Emperor(){

    }

    private Emperor(String name){
        emperorNameList.add(name);
    }

    //随机取出一位
    public static Emperor getEmperor(){
        Random random = new Random();
        countNum = random.nextInt(maxNumEmperor);
        return (Emperor) emperorList.get(countNum);
    }

    //说出自己的名字
    public void getName(){
        System.out.println(emperorNameList.get(countNum));
    }
}
