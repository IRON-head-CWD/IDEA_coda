package com.itheima;

public class Test06 {
    public static void main(String[] args) {
        int i=10,j=25,x=30;
        switch (j-i){
            case 15:x++;
            case 16:x+=2;
            case 17:x+=3;
            default:--x;
        }
        System.out.println(x);
    }
}
