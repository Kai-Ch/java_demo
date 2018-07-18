package com.jd.jdk8.lambda;

/**
 * @Author:kaichenr
 * @Date:2018/7/18 11:21
 **/
public class LambdaThread {
    public static void main(String[] args) throws InterruptedException {
        LambdaThread lt = new LambdaThread();
        lt.oldThread();
    }

    public void oldThread() throws InterruptedException {
        System.out.println("oldThread start....");
        new Thread(
                ()->{
                    System.out.println("hello");
                    System.out.println("hello world");
                }
        ).start();
        System.out.println("oldThread end....");
    }

    public LambdaThread() {
        super();
    }
}
