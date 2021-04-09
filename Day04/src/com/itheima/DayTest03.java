package com.itheima;
/*
比较数组中大小，输出最大值
 */
public class DayTest03 {
    public static void main(String[] args) {
        int [] arr=new int[] {11,12,15,16,17};
        int max=arr[0];
        for(int i=1;i< arr.length;i++){
            if(max<arr[i]){
                max=arr[i];

            }
        }
        System.out.println(max);
    }
}
