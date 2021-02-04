package com.demo.Interview.socket;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Demo4 {

    public static void main(String[] args) throws IOException {

        Socket socket = new Socket("localhost", 9999);
        OutputStream outputStream = socket.getOutputStream();

        // 不断发消息给对方
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("请输入要发送的消息:");
            String info = scanner.nextLine();
            outputStream.write(info.getBytes("UTF-8"));
        }
    }
}
