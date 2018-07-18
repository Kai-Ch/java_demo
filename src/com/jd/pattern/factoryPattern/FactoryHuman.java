package com.jd.pattern.factoryPattern;

/**
 * author:'kaichenr'
 * time:'2018/5/4'
 **/
public class FactoryHuman {


    public static Human createHuman(Class c){
        Human human = null;

        try {
            human = (Human) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            System.out.println("颜色不对");
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            System.out.println("人种定义错误");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("未找到人种");
            e.printStackTrace();
        }
        return human;
    }

}
