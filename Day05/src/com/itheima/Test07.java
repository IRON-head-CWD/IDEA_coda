package com.itheima;

import java.util.Scanner;

/*
java语言中，数组是长度固定的，即数组一旦初始化，该数组的长度就固定不变了。
那么如果有更多的元素要存入数组，就需要定义新的数组来实现。
现有如下数组：
    int[] arr = {11, 22, 33, 44, 55};
1、请通过键盘再录入一个整数，将其存储到已有元素的尾部，并遍历数组打印所有的元素。
2、观察发现，原数组中的元素是按照升序排序的，请重新实现上述第一问中的需求，保证元素应添加到合适的位置，使得数组中的数据仍然保持升序。
 */
public class Test07 {
    public static void main(String[] args) {
        //定义2个数组
        int[] arr = new int[]{11, 22, 33, 44, 55};
        int[] newArr = new int[arr.length + 1];
        //键盘录入数据
        Scanner sc = new Scanner(System.in);
        System.out.println("Please importing a data:");
        int data = sc.nextInt();
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            //如果data大于arr[i]
            if (data >= arr[i]) {
                newArr[i] = arr[i];
                index = 1 + i;
            }
            //如果data小于arr[i]
            else if (data < arr[i]) {
                newArr[i + 1] = arr[i];
            }
        }
        //将data与newArr[]中的元素相结合
        newArr[index] = data;
        System.out.print("生成的新数：");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}
