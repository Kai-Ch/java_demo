package com.demo.others.vector;

import java.util.concurrent.atomic.AtomicBoolean;

public class WBSOutAssembly {

    private AtomicBoolean wbsOut = new AtomicBoolean();

    private static class Handler {
        private static WBSOutAssembly wbsOutAssembly = new WBSOutAssembly();
    }

    private WBSOutAssembly() {
        wbsOut = new AtomicBoolean(true);
    }

    public static WBSOutAssembly getInstance() {
        return Handler.wbsOutAssembly;
    }

    public AtomicBoolean getWbsOut() {
        return wbsOut;
    }

    public void setWbsOut(boolean value){
        wbsOut.set(value);
    }

}