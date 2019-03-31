/**
 * @Auther: KaiCh
 * @Date: 2019/3/4 14:47
 * @Description:
 */
package com.others;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TZX {

    private TZXAssembly tzxAssembly = TZXAssembly.getInstance();

    private Logger log = LoggerFactory.getLogger(TZX.class);

    private void p1(String data) throws InterruptedException {
        log.info("p1:{}", "p1");
    }

    private void p2(String data) throws InterruptedException {
        log.info("p2 String ：{}", data);
        if("2".equals(data) && tzxAssembly.getReSend().get() <= 2){
            log.info("SUV调整线上线重新下发队列信息");
            p1(data);
            tzxAssembly.getReSend().incrementAndGet();
            log.info("reSend : {}", tzxAssembly.getReSend().get());
            p2(data);
        }else {
            tzxAssembly.clear();
        }
    }

    public void service() throws InterruptedException {
        String data = "2";
        p1(data);
        p2(data);
    }

    public static void main(String[] args) throws InterruptedException {
        TZX tzx = new TZX();
        tzx.service();
    }
}
