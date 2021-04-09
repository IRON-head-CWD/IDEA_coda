package com.itheima.Day03;
/*
10、【编号：310】 求1-100直接所有是3的倍数的整数的和，并将该结果输出到控制台。
12、【编号：312】 统计"水仙花数"一共有多少个，并在控制台输出个数。 水仙花数：是一个三位数，它的每个位上的数字的 3次幂之和等于它本身。
 */
public class DayTest10 {
    public static void main(String[] args) {
        int i = 100;
        int count=0;
        for (; i <= 999; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;
            if (i == ge * ge * ge + shi * shi * shi + bai * bai * bai){
                System.out.println(i);
                count++;
            }
        }System.out.println(i);
        System.out.println(count);
    }
}