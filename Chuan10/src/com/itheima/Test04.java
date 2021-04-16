package com.itheima;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test04 {
    public static void main(String[] args) {
        HashMap<shoopCar,Integer> shoop=new HashMap<>();
        shoopCar one=new shoopCar("iphone",4500);
        shoopCar two=new shoopCar("huawei",4500);
        shoopCar three=new shoopCar("oppo",4500);
        shoopCar four=new shoopCar("vivo",4500);
        shoop.put(one,1);
        shoop.put(two,1);
        shoop.put(three,1);
        shoop.put(four,1);
        int sum=0;
        Set<Map.Entry<shoopCar, Integer>> entries = shoop.entrySet();
        for (Map.Entry<shoopCar, Integer> entry : entries) {
            shoopCar key=entry.getKey();
            Integer value=entry.getValue();
            int danJia=key.getPrice()+value;
            sum+=danJia;
        }
        System.out.println(sum);
    }
}
