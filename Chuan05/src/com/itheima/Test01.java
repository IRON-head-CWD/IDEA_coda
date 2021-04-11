package com.itheima;

public class Test01 {
    public static void main(String[] args) {
        int[] arr=new int[]{1,2,4,48,48,48,48,48,874,57,84,48,};
        for (int i = 0; i <arr.length ; i++) {
            //在长度减一和零中找到数据i；
         int j=(int)(Math.random()*arr.length) ;
         int temp=arr[i];
         arr[i]=arr[j];
         arr[j]= temp;
            System.out.print(arr[i]+"\t");
        }

    }
}
