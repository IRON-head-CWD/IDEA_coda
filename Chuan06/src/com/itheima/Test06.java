package com.itheima;

public class Test06 {
    public static void main(String[] args) {
        try {
            function(1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

        public static void function ( int num) throws
        ArithmeticException, ArrayIndexOutOfBoundsException, NullPointerException {
            if (num == 0) {
                System.out.println(3 / 0);
            }
            if (num == 2) {
                int[] array = new int[3];
                System.out.println(array[4]);
            }
            if (num == 3) {
                String s = null;
                System.out.println(s.length());
            }
            System.out.println("right");
        }
    }