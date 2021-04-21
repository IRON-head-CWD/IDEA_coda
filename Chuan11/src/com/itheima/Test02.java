package com.itheima;


import java.util.ArrayList;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test02 {
    public static void main(String[] args) {
       // Stream<String> sm= ArrayList.stream();
       // Stream<String> sm=set.stream();
        checkCollectSet();
        CLIIECTION();
    }

    private static void CLIIECTION() {
        //获取到 Stream 流对象
      //  Stream<String> stream = set.stream("盖伦", "亚索", "艾希", "亚瑟", "狄仁杰", "貂蝉", "亚索");
        //验证收集的方法 collect()

    }

    public static void checkCollectSet() {
        //获取到 Stream 流对象
        Stream<String> stream = Stream.of("盖伦", "亚索", "艾希", "亚瑟", "狄仁杰", "貂蝉", "亚索");
        //验证收集的方法 collect()
        //收集成为 Set 集合
        Set<String> set = stream.collect(Collectors.toSet());
        set.forEach(s -> System.out.println(s));
    }

}
