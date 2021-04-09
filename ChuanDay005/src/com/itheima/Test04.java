package com.itheima;

public class Test04 {
    public  static int Factory(int n){
        if(n==1){
            return 1;
        }else{
          return  Factory(n-1)*n;
        }
    }

    public static void main(String[] args) {
        System.out.println(Factory(5));
    }
}
