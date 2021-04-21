package com.itheima03;

public class Outer {
    String name = "隔壁老王";

    class Innter {
        String name = "家里小王";

        public void show() {
            String name = "小王";
            System.out.println(name);
            System.out.println(this.name);
            System.out.println(Outer.this.name);
        }
    }
}
