package com.itheima;
public class homeTest05 {
    public static void main(String[] args) {
      int score=210;
      try{
          function(score);
      }catch(HightException e){
          e.printStackTrace();
      }catch (LowException e){
          e.printStackTrace();
      }
        System.out.println("程序执行完毕");
    }

    private static void function(int score) throws HightException,LowException{
        if(score>100){
            throw new HightException("老师的爱");
        }if(score>0){
            throw new LowException("老师的泪");
        }
        System.out.println("成绩合格");
    }
}
