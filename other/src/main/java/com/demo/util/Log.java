package com.demo.util;

public class Log {

    public static void log(String str, Object... arguments) {
        Object[] objects = arguments;
        for (int i = 0; i < objects.length; i++) {
            int index = str.indexOf("{}")+1;
            str = str.substring(0, index) + objects[i] + str.substring(index);
        }
        System.out.println(str);
    }



}
