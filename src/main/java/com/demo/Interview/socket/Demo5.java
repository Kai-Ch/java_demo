package com.demo.Interview.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Demo5 {

    public static void main(String[] args) throws IOException {
        // 监听本地端口
        ServerSocket serverSocket = new ServerSocket(9999);

        Socket socket = serverSocket.accept();

        System.out.println("有人连接!");

        final OutputStream outputStream = socket.getOutputStream();
        final InputStream inputStream = socket.getInputStream();

        // 不断发消息给对方
        new Thread(){
            public void run(){
                Scanner scanner = new Scanner(System.in);

                while (true){
                    try {
                        System.out.println("请输入要发送给Demo6消息:");
                        String info = scanner.nextLine();
                        outputStream.write(info.getBytes("UTF-8"));
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }
        }.start();

        // 不断接收消息
        new Thread(){
            public void run(){
                byte[] b = new byte[1024];
                // 不断接收消息
                while (true){
                    try {
                        int count = inputStream.read(b);
                        String info = new String(b, 0, count, "UTF-8");
                        System.out.println("接收到Demo6" + info);
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }
        }.start();
    }
}
