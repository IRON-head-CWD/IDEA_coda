package com.itheima05;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServerDemo {
    public static void main(String[] args) throws Exception {
        //服务器
        ServerSocket serverSocket =new ServerSocket(10086);
        //监听器
        Socket socket=serverSocket.accept();
        //获取输出流写（读）数据
        BufferedWriter writer=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        BufferedReader reader=new BufferedReader(new InputStreamReader(socket.getInputStream()));
        //读一行
        String line=reader.readLine();
        System.out.println("line"+line);
        //写
        writer.write("niyehao???");
        writer.newLine();
        writer.flush();

        serverSocket.close();
    }
}
