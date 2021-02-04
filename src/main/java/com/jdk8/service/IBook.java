package com.jdk8.service;

/**
 * @Author:kaichenr
 * @Date:2018/7/20 16:25
 **/
public interface IBook {

    void openBook();

    void readBook();

    default void closeBook(){
        System.out.println("Close Book!!!");
    }
}
