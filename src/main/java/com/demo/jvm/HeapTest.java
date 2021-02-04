package com.demo.jvm;

import java.util.ArrayList;
import java.util.List;

public class HeapTest {

    public byte[] bytes = new byte[1024*100];

    public static void main(String[] args) throws InterruptedException {
        List<HeapTest> list = new ArrayList<HeapTest>();
        while (true){
            HeapTest heapTest = new HeapTest();
            list.add(heapTest);
            Thread.sleep(50);
        }
    }
}
