package com.demo.others.vector;

import java.util.Vector;

public class WBSAssembly {

    private Vector<WBSTask> vector;

    private static class Handler {
        private static WBSAssembly tzxAssembly = new WBSAssembly();
    }

    private WBSAssembly() {
        vector = new Vector<WBSTask>();
    }

    public static WBSAssembly getInstance() {
        return Handler.tzxAssembly;
    }

    public Vector<WBSTask> getVector() {
        return vector;
    }

}