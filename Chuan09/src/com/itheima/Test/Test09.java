package com.itheima.Test;

import java.util.Comparator;
import java.util.TreeSet;

public class Test09 {
    public static void main(String[] args) {
        TreeSet<Car> ts=new TreeSet<>(new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                int result=Double.compare(o2.getPrice(),o1.getPrice());
                result=(result==0)?o1.getAge()-o2.getAge():result;
                result=(result==0)?o1.getBrand().compareTo(o2.getBrand()):result;
                return result;
            }
        });
        ts.add(new Car("4445",2,18.6));
        ts.add(new Car("4445",2,18.6));
        ts.add(new Car("4445",2,18.6));
        ts.add(new Car("4445",2,18.6));
        ts.add(new Car("4445",2,18.6));
        ts.add(new Car("4445",2,18.6));

        ts.forEach(c-> System.out.println(c));
    }
}
