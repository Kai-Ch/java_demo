package com.demo.Interview.socket;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Demo3 {

    public static void main(String[] args) throws IOException {

        //监听本地端口
        ServerSocket serverSocket = new ServerSocket(9999);

        Socket socket = serverSocket.accept();
        System.out.println("有人连接!");


        InputStream in = socket.getInputStream();
        byte[] b = new byte[1024];
        // 不断接收消息
        while (true){
            int count = in.read(b);
            String info = new String(b, 0, count, "UTF-8");
            System.out.println("接收到的" + info);
        }
    }
}
