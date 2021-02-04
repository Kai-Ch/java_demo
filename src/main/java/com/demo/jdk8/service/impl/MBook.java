package com.demo.jdk8.service.impl;

import com.demo.jdk8.service.IBook;

/**
 * @Author:kaichenr
 * @Date:2018/7/20 16:29
 **/
public class MBook {
    public static void main(String[] args) {
        IBook iBook = new BookServiceImpl();
        iBook.closeBook();



    }
}
