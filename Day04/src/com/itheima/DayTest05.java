package com.itheima;
/*
输入一个数
利用遍历
找出输入的数存在数组中的位置
 */
import java.util.Scanner;

public class DayTest05 {
    public static void main(String[] args) {
        int[]arr=new int[]{11,12,113,16,23,15,1,31,3,12,13,1,1,878,78,46,16,4,6};
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int index=-1;
        for (int i = 0; i < arr.length; i++) {
            if(num==arr[i]){
                index=i;
                break;
            }
        }
        if (index==-1){
            System.out.println("吊毛没得");}
            else if(index!=-1){
                System.out.println("仔细看"+(index+1));
            }
        }
    }

