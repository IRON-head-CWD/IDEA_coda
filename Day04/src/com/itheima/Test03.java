package com.itheima;
/*
0-99内产生6个随机数
求出数组元素和
 */
import java.util.Random;

public class Test03 {
    public static void main(String[] args) {
        //为随机数产生堆空间
        Random r = new Random();
        //创建一个长度为6的数组
        int[] arr = new int[6];
        //随机生成6个整数，利用遍历产生6个数
        for (int i = 0; i < arr.length; i++) {
            int num = r.nextInt(100);
            arr[i] = num;
            System.out.println(arr[i]);
        }
        //定义一个数作为“和“
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        //产生元素和
        System.out.println("元素和" + sum);
    }
}
