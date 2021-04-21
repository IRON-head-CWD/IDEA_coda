package com.itheima;

public class Test {
    public static void main(String[] args) {
        int[] arr={1,2,6,5,56,56,4,48};

      //  System.out.println(getMax(max));

        System.out.println(getMax(arr));
    }

    private static int getMax(int... arr) {
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i]){
                max=arr[i];
            }

        }
        return max;
    }
}
