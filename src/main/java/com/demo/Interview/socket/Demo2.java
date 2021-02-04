package com.demo.Interview.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Demo2 {

    public static void main(String[] args) throws IOException {

        // 连接9999端口
        Socket socket = new Socket("localhost", 9999);

        // 发送信息给对方
        OutputStream outputStream = socket.getOutputStream();
//        outputStream.write("hello".getBytes());
        outputStream.write("hello中国".getBytes("UTF-8"));

        //接收
        InputStream in = socket.getInputStream();
        byte[] b = new byte[1024];
        int count = in.read(b);
        String info = new String(b, 0, count);
        System.out.println(info);
    }
}
