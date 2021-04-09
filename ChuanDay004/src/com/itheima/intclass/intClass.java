package com.itheima.intclass;

public class intClass {
    String name = "body";

    class Heat {
        String name = "body";

        public void jump() {
            String name = "heat";
            //子类
            System.out.println(name);
            //成员变量
            System.out.println(this.name);
            //
            System.out.println(intClass.this.name);
        }
    }
}
    class outClass {
        public void Leg() {
            System.out.println("dad");
        }
    }

