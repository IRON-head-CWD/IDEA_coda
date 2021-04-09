package com.itheima.Function;

public class Test {
    public static void main(String[] args) {
        function(new JieKou(){
            @Override
            public String methodAbstract(){
               return "hello" ;
            }
        });
        function(()->{
return "world";
        });
    }
    public static void function(JieKou kou){
      String result=kou.methodAbstract();
    }
}
