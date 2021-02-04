package com.demo.Interview.base.io;

import java.io.File;

/**
 * @Author:chenkai
 * @description: 构建File对象
 * @Date:2019/9/6 13:01
 */
public class FileDemo2 {

    public static void main(String[] args) {
        String path = "E:/File/b.jpg";

        // 1. 构建file
        File file = new File(path);
        System.out.println(file.length());

        // 2. 构建file
        File file1 = new File("E:/File", "b.jpg");
        System.out.println(file.length());

        // 3. 构建file
        File file2 = new File(new File("E:/File"), "b.jpg");
        System.out.println(file2.length());

    }
}
