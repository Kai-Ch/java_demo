/**
 * @Auther: KaiCh
 * @Date: 2019/4/18 10:00
 * @Description:
 */
package com.demo.others.vector;

import java.io.Serializable;
import java.util.Comparator;

public class WBSTask implements Serializable, Comparator<WBSTask> {

    private long sj;

    private String wld;

    public long getSj() {
        return sj;
    }

    public void setSj(long sj) {
        this.sj = sj;
    }

    public String getWld() {
        return wld;
    }

    public void setWld(String wld) {
        this.wld = wld;
    }

    @Override
    public int compare(WBSTask o1, WBSTask o2) {
        if(o1.getSj() >= o2.getSj()){
            return 1;
        }else {
            return -1;
        }
    }
}
