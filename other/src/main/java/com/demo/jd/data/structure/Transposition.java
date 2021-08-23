package com.demo.jd.data.structure;

import org.junit.Test;

/**
 * @Author:kaichenr
 * @Date:2018/9/3 14:44
 * @Description:
 **/
public class Transposition {

    @Test
    public void leftPositionTest(){
        int num = 3;
        System.out.println(left(num));
    }

    /**
     * 2^n
     * @param num
     * @return
     */
    private long left(long num){
        return 1 << num;
    }
}
