package com.itheima;
/*
有一个容量为10L的空水桶。水桶的上面开始往里灌水，同时下面开始往出流水。
第一分钟灌水的速度是1L/min，
第二分钟灌水的速度是2L/min，
第三分钟灌水的速度是3L/min，以此类推。
而流水的速度固定是3L/min。那么请问几分钟之后，水桶里能保持灌满水的状态？

 */
public class Test03 {
    public static void main(String[] args) {
        //水入,水出，桶容量，time;
        int time = 0, r = 1, c = 3, t = 0;
        while (t < 10) {
            time++;
            ////桶装水量公式
            t = t+r - c;
            r++;
            if(t<0){
                t=0;
            }
        }
        System.out.println(time);
    }
}
