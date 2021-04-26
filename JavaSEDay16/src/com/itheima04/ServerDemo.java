package com.itheima04;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        //创建socket对象
        ServerSocket ss=new ServerSocket(1000);
        //监听客户端链接，返回一个对应的socket对象
        Socket socket=ss.accept();
        //获取输入流来读取数据
        InputStream inputStream=socket.getInputStream();
        byte[] bytes=new byte[1024];
        int len;
        while((len=inputStream.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }
        ss.close();
    }
}
