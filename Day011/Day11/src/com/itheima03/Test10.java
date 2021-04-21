package com.itheima03;

public class Test10 {
    public static void main(String[] args) {
        //匿名内部类的写法格式
        say(new JieKou(){
           public void methodAbstract(){
               System.out.println("匿名内部类");
           }
        });
        System.out.println("----------");
        //采用lambad表达式的写法
        say(()->{
            System.out.println("lambad的表达式");
        });
    }
    public static void say(JieKou kou){
       //调用抽样方法
       kou.methodAbstract();
    }
}
