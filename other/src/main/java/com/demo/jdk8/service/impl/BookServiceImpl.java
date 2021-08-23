package com.demo.jdk8.service.impl;

import com.demo.jdk8.service.IBook;

/**
 * @Author:kaichenr
 * @Date:2018/7/20 16:28
 **/
public class BookServiceImpl implements IBook {
    @Override
    public void openBook() {
        System.out.println("Open Book!!!");
    }

    @Override
    public void readBook() {
        System.out.println("Read Book!!!");
    }

    @Override
    public void closeBook() {
        System.out.println("Use foot close book !!!");
    }
}
