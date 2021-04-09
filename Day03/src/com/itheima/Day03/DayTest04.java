package com.itheima.Day03;
/*4、【编号：319】 有一个输出语句System.out.print("@")，表示输出一个"@"，并且不换行。使用这个语句，在控制台打印出一个四行五列的长方形，效果如下：
@@@@@
@@@@@
@@@@@
@@@@@*/

public class DayTest04 {
    public static void main(String[] args) {
            for (int i = 0; i<4; i++) {
                for (int j = 0; j <5; j++) {
                    System.out.print("@");
                }System.out.println();
            }
        }
    }