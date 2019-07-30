/**
 * @Auther: KaiCh
 * @Date: 2019/4/18 13:44
 * @Description:
 */
package com.others.vector;

import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicBoolean;

public class TestCase {

    private Logger log = LoggerFactory.getLogger(TestCase.class);

    @Test
    public void test1() {
        WBSTask w1 = new WBSTask();
        WBSTask w2 = new WBSTask();
        WBSTask w3 = new WBSTask();
        w1.setSj(1000);
        w2.setSj(1001);
        w3.setSj(1002);

        Vector<WBSTask> vector = WBSAssembly.getInstance().getVector();
        vector.add(w2);
        vector.add(w1);
        vector.add(w3);

        vector.sort((o1, o2) -> {
            if (o1.getSj() > o2.getSj()) {
                return 1;
            } else {
                return -1;
            }
        });

        log.info("vector:{}", JSON.toJSONString(vector));
    }


    @Test
    public void test2() {
        AtomicBoolean b1 = WBSOutAssembly.getInstance().getWbsOut();
        System.out.println(b1.get());

        b1.set(false);
        AtomicBoolean b2 = WBSOutAssembly.getInstance().getWbsOut();
        System.out.println(b2.get());
    }

    @Test
    public void test3() {
        System.out.println("23".substring(1, 2));
    }


    @Test
    public void test4(){
        String str = "B+PLC+Q+00000032LK5E3D1W3JA151415EM11             BB 0201+E";
        System.out.println(str.length());
    }
}
