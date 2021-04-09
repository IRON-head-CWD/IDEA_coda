package com.itheima;
/*
int[]{1, 2, 0, 0, 0, 8, 9, 5, 15, 4656, 46, 0};
输出：12895154656460000
 */
public class Test06 {
    public static void main(String[] args) {
        //创建一个数组
        int[] arr = new int[]{1, 2, 0, 0, 0, 8, 9, 5, 15, 4656, 46, 0};
        //创建一个新的动态数组
        int[] newArr = new int[arr.length];
        //定义所索引位置
        int index = 0;
        //遍历中判断
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                newArr[index] = arr[i];
                index++;
            }

        }
        for (int j = 0; j < newArr.length; j++) {
            System.out.print(newArr[j]);

        }
    }
}
