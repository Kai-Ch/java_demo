/**
 * @Auther: KaiCh
 * @Date: 2019/3/4 14:41
 * @Description:
 */
package com.demo.others;

import java.util.concurrent.atomic.AtomicInteger;

public class TZXAssembly {
    private AtomicInteger reSend = new AtomicInteger();

    private AtomicInteger queueOrder = new AtomicInteger();

    private static class Handler {
        private static TZXAssembly tzxAssembly = new TZXAssembly();
    }

    private TZXAssembly() {
        queueOrder.set(1);
    }

    public static TZXAssembly getInstance() {
        return TZXAssembly.Handler.tzxAssembly;
    }

    public void clear(){
        reSend.set(0);
    }

    public AtomicInteger getReSend() {
        return reSend;
    }

    public AtomicInteger getQueueOrder() {
        return queueOrder;
    }
}
