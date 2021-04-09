package com.itheima.Day03;
/*
6、【编号：321】 请使用循环语句在控制台打印九九乘法表。打印效果如下：
1*1=1
1*2=2	2*2=4
... ...
1*9=9	2*9=18	3*9=27	4*9=36	5*9=45	6*9=54	7*9=63	8*9=72	9*9=81
*/

public class DayTest06 {
    public static void main(String[] args){
        for(int i=1;i<=9;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i + "*" + j + "=" + j*i + "\t");//输出内容
            }System.out.println();//控制三角形结构
        }
    }
}
