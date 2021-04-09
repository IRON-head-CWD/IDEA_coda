package com.itheima;
/*
故事得从西元1202年说起，话说有一位意大利青年，名叫斐波那契。
在他的一部著作中提出了一个有趣的问题：
假设一对刚出生的小兔一个月后就能长成大兔，
再过一个月就能生下一对小兔，
并且此后每个月都生一对小兔，
一年内没有发生死亡。
问：一对刚出生的兔子，一年内繁殖成多少对兔子?
 */
public class Test04 {
    public static void main(String[] args) {
        //定义月份
        int[]arr=new int[12];
        //初始化1月和2月；
        arr[0]=1;
        arr[1]=1;
        //遍历得到第三月等于前面2个月份的和
        for (int i = 2; i < arr.length; i++) {
            arr[i]=arr[i-1]+arr[i-2];
        }System.out.println(arr[arr.length-1]);
    }
}
