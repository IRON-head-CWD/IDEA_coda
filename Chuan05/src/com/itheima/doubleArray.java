package com.itheima;

public class doubleArray {
    public static void main(String[] args) {
        double[] arr = {0.1, 0.2, 2.1, 3.2, 5.56, 7.21};
        double sum = 0;
        double average = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
     //   double valueChu = sum.divide(arr.length-1).doubleValue();
      //  System.out.println("valueChu = " + valueChu);
        System.out.println();
    }
}
