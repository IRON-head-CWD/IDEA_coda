package com.itheima;
/*
遍历输出最小值
 */
public class Test02 {
    public static void main(String[] args) {
        //创建一个数组
        double[]arr=new double[]{12.9,53.54,75.0,99.1,3.14};
        //定义一个值min
        double min=arr[0];
        //遍历一个数组从中筛选出最小值
        for (int i = 0; i < arr.length; i++) {
            if(min>=arr[i]){
                min=arr[i];
            }

        }System.out.println(min);
    }
}
