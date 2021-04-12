package com.itheima;

import java.util.Scanner;

public class homeTest02 {
    public static void main(String[] args) {
        String[] arr = {"星期一", "星期二", "星期三", "星期四", "星期五", "星期六", "星期日"};
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        switch (index) {
            case 1:
                System.out.println(arr[0]);
                break;
            case 2:
                System.out.println(arr[1]);
                break;
            case 3:
                System.out.println(arr[2]);
                break;
            case 4:
                System.out.println(arr[3]);
                break;
            case 5:
                System.out.println(arr[4]);
                break;
            case 6:
                System.out.println(arr[5]);
                break;
            case 7:
                System.out.println(arr[6]);
                break;
            default:
                method();
        }
    }

    public static void method() {
        try {
            //1.空指针异常
            String srr = null;
            System.out.println(srr.length());
            //2.索引越界异常
            int[] arr = new int[3];
            System.out.println(arr[5]);

        } catch (NullPointerException e) {
        } catch (ArrayIndexOutOfBoundsException e) {
        } catch (ArithmeticException e) {
        } catch (Exception e) {
        }
        System.out.println("输入错误");
    }

}
