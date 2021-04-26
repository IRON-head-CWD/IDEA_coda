package com.itheima04;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

public class TCPClienrDemo {
    public TCPClienrDemo() throws IOException {
    }

    public static void main(String[] args) throws IOException {
        //创建对象
        Socket socket=new Socket("192.168.13.63",9999);
        //基于流传输数据
        OutputStream outputStream =socket.getOutputStream();
        //写数据
        outputStream.write("3333333333".getBytes());
        //释放资源
        socket.close();
    }

}
