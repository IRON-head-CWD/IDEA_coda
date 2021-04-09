package com.itheima.Works;

import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        //键入字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String Chars = sc.nextLine();
        //定义三个变量；
        int bigCount=0;
        int smallCount=0;
        int numberCount=0;
        //遍历出每个字符；并且逐个筛选出在范围内的字符
        for (int i = 0; i < Chars.length(); i++) {
            //遍历出字符；
            char ch = Chars.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                bigCount++;
            }else if(ch>='a'&&ch<='z'){
                smallCount++;
            }else if(ch>='0' && ch<='9'){
                numberCount++;
            }
        }
        System.out.println(smallCount+bigCount);
        System.out.println(numberCount);
    }
}
