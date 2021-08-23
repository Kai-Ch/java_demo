package com.demo.niuke;

/**
 * @Description:
 * @Author: Kai
 * @Date: 2021/8/23 22:37
 */
public class TestThread {

//    public static void main(String[] args) {
//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("foo");
//            }
//        };
//
//        Thread thread = new Thread(runnable);
//        thread.run();
//
//        System.out.println("bar");
//    }


    public static void main(String args[]) {
        Thread t = new Thread() {
            public void run() {
                pong();
            }
        };
        t.run();
        System.out.print("ping");
    }
    static void pong() {
        System.out.print("pong");
    }
}


