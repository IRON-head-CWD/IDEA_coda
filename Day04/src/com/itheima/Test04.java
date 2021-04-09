package com.itheima;
/*求数组元素和
求平均值
 */
public class Test04 {
    public static void main(String[] args) {
        //定义一个数组

        //创建10个数组元素
        int[] arr = new int[]{72,89,65,87,91,82,71,93,76,68};

        //定义一个平均数
        int avg = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            avg = sum / 10;
        }System.out.println(avg);
    }
}