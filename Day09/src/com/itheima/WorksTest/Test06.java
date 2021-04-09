package com.itheima.WorksTest;

public class Test06 {
    public static void main(String[] args) {

            String str = "192-168-12-17";
            String[] array = str.split("-");
            for(int i=0; i<array.length; i++){
                System.out.println(array[i]);
            }
        }
    }


