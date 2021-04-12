package com.itheima;

public class Test01 {
    public static void main(String[] args) {
        int score=20;
        try {
            function(score);
        } catch (HightException e) {
            e.printStackTrace();
        }catch (LowException e){
            e.printStackTrace();
        }
        System.out.println("");
    }
    public static void function (int score) throws HightException,LowException{
        if(score>100){
            throw new HightException("");
        }
        if (score<0){
            throw new LowException("");
        }
        System.out.println("考试");
    }
}
