package com.itheima;
/*
6、【编号：413】 小李用自己的钱买了十只股票，年末他看了各只股票的收益分别是百分之:10.4,-3,-6.2,1.2,-6.1,-19,-3.8,0.9,-4.5,5.5。
请使用数组相关知识编程，帮他统计赚钱的股票和赔钱的股票分别有多少只？打印效果如下：
赚钱的股票一共有：4只
赔钱的股票一共有：6只
 */
public class Test06 {
    public static void main(String[] args) {
        //定义2个股票数
        int count1 = 0;
        int count2 = 0;
        //遍历一遍数组
        double[] arr = new double[]{10.4, -3, -6.2, 1.2, -6.1, -19, -3.8, 0.9, -4.5, 5.5};
        for (int i = 0; i < arr.length; i++) {
            //大于0股票数加一
            if (arr[i] > 0) {
                count1++;
            }
            //小于0股票数加一
            if (arr[i] <= 0) {
                count2++;
            }

        }//显示
        System.out.println("赚钱的股票一共有：" + count1 + "只");
        System.out.println("赚钱的股票一共有：" + count2 + "只");
    }
}
