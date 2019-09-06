package com.Interview.concurrence;

public class ThreadLocalDemo2 {

    public static ThreadLocal<Integer> no = new ThreadLocal<Integer>(){
        public Integer initialValue(){
            return 0;
        }
    };

    public int getNextNum(){
        no.set( no.get()+1);
        return no.get();
    }

    public static void main(String[] args) {
        ThreadLocalDemo2 threadLocalDemo2 = new ThreadLocalDemo2();
        TestThread testThread1 = new TestThread(threadLocalDemo2);
        TestThread testThread2 = new TestThread(threadLocalDemo2);
        TestThread testThread3 = new TestThread(threadLocalDemo2);
        testThread1.start();
        testThread2.start();
        testThread3.start();
    }


    private static class TestThread extends Thread{
        private ThreadLocalDemo2 threadLocalDemo2;

        public TestThread(ThreadLocalDemo2 threadLocalDemo2) {
            this.threadLocalDemo2 = threadLocalDemo2;
        }

        public void run(){
            for (int i = 0; i < 3; i++) {
                // ④每个线程打出3个序列值
                System.out.println("thread[" + Thread.currentThread().getName() + "] --> threadLocalDemo2["
                        + threadLocalDemo2.getNextNum() + "]");
            }
        }
    }
}
