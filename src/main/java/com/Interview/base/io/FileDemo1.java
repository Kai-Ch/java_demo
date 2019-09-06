package com.Interview.base.io;

import java.io.File;
import java.io.IOException;

/**
 * @Author:chenkai
 * @description:
 * @Date:2019/9/6 12:43
 */
public class FileDemo1 {

    public static void main(String[] args) {
        File file = new File("E:\\File\\a.txt");
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.out.println("创建文件失败!");
                e.printStackTrace();
            }
        }else {
            System.out.println("文件存在");
        }

    }
}
