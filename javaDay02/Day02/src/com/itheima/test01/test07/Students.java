package com.itheima.test01.test07;

public  class Students extends Man {
    public Students() {
        super();
    }
    public Students(String number, String name, String sex, String old) {
        super(number, name, sex, old);
    }

    @Override
    public void eat() {
        System.out.println("营养早餐");
    }
    public void show(){
        System.out.println(number+"\t"+name+"\t"+sex+"\t"+old);
    }
}
