package com.itheima02;

public class Test01 {
    public static void main(String[] args) {
        int score = 10;
        try {
            function(score);
        } catch (HightException e) {
            e.printStackTrace();
        }catch (LowException e) {
            e.printStackTrace();
        }
    }

    private static void function(int score) throws HightException,LowException{
        if(score>100&&score<0){
            System.out.println("It is not right");
        }
        System.out.println("zhenque");
    }
}