package com.itheima;

public class Test07 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int number=11;
        int index=binarySearchForIndex(arr,number);
        System.out.println(index);
    }

    private static int binarySearchForIndex(int[] arr, int number) {
        //定义查找范围
        int min=0;
        int max=arr.length-1;
        //循环查找min<max
        while(min<=max){
            //计算出中间位置mid
            int mid=(min+max)>>1;
            //mid指向的元素>number
            if(arr[mid]>number){
                //表达要查找的元素在左边
                max=mid-1;
            }else if(arr[mid]<number){
                //mid指向的元素<number
                //表示要查找的元素在右边
                min=mid+1;
            }else{
                //mid指向的元素==number
                return mid;}
        }
        //如果min大于max就表示元素不存在，返回-1
        return -1*(arr.length+1);
    }
}
