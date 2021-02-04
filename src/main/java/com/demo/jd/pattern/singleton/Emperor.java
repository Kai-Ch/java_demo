package com.demo.jd.pattern.singleton;

/**
 * 单例模式(皇帝)
 * author:'kaichenr'
 * time:'2018/5/3'
 **/
public class Emperor {
    private static Emperor emperor = null;

    //私有化构造器
    private Emperor(){

    }

    public static Emperor getEmperor() {
        if(emperor == null){
            emperor = new Emperor();
        }
        return emperor;
    }

    public static void goToCourt(){
        System.out.println("上朝啦！！！！");
    }

    public static void sayName(){
        System.out.println("朕是乾隆皇帝");
    }
}
