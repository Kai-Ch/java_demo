package com.Interview.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Demo1 {

    public static void main(String[] args) throws IOException {
        // Socket通讯

        // 监听本地端口，等待别人连接自己
        ServerSocket serverSocket = new ServerSocket(9999);

        Socket socket = serverSocket.accept();

//        System.out.println("有人连接!");

        // 接收消息
        InputStream in = socket.getInputStream();
        byte[] b = new byte[1024];
        int count = in.read(b);
        String info = new String(b, 0, count, "UTF-8");
        System.out.println(info);

        // 发送消息
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("hello-server".getBytes());

    }
}
