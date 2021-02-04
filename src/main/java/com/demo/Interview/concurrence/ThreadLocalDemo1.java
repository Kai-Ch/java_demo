package com.demo.Interview.concurrence;

import org.junit.Test;

public class ThreadLocalDemo1 {

    @Test
    public void test1(){
        ThreadLocal<Integer> a = new ThreadLocal<Integer>();
        a.set(1);
        System.out.println(a.get());
        a.remove();
        System.out.println(a.get());
    }

    @Test
    public void  test2(){


    }

    private static final ThreadLocal<String> threadLocalA = new ThreadLocal<>();
    private static final ThreadLocal<String> threadLocalB = new ThreadLocal<>();

    /**
     * 在调用的线程的map中存入key为ThreadLocal本身，value为在该线程设置的值
     * @param value
     */
    public static void setValueA(String value){
        threadLocalA.set(value);
    }

    public static String getValueA(){
        return threadLocalA.get();
    }

    public static void clearValueA(){
        threadLocalA.remove();
    }

    public static void setValueB(String value){
        threadLocalB.set(value);
    }

    public static String getValueB(){
        return threadLocalB.get();
    }

    public static void clearValueB(){
        threadLocalB.remove();
    }


    public static void main(String[] args) {
        //线程1的ThreadLocalMap中存着key为threadLocalA，value为A1；key为threadLocalB，value为B1
        new Thread() {
            @Override
            public void run() {
                setValueA("A1");
                System.out.println(Thread.currentThread().getName() + getValueA());
                clearValueA();

                setValueB("B1");
                System.out.println(Thread.currentThread().getName() + getValueB());
                clearValueB();
            }
        }.start();

        //线程2的ThreadLocalMap中存着key为threadLocalA，value为A2；key为threadLocalB，value为B2
        new Thread() {
            @Override
            public void run() {
                setValueA("A2");
                System.out.println(Thread.currentThread().getName() + getValueA());
                clearValueA();

                setValueB("B2");
                System.out.println(Thread.currentThread().getName() + getValueB());
                clearValueB();
            }
        }.start();

    }
}
