package com.itheima.Function2;

public class Test {
    public static void main(String[] args) {
        function(10,20,new JieKou(){
            @Override
            public int methodAbstract(int x, int y) {
                return x+y;
            }
        });
        function(10,20,( x, y)->{
            return x+y;
        });
    }
    private static void function(int i, int i1, JieKou jieKou) {
        int result= jieKou.methodAbstract(i,i1);
        System.out.println(result);
    }


}
