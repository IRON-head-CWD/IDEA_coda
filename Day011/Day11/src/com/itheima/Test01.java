package com.itheima;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Test01 {
    public static void main(String[] args) {
        List<String> array=new ArrayList<>();
        array.add("");
        List<String> one = array.stream().filter(s -> s.startsWith("张")).filter(s -> s.length() == 3).collect(Collectors.toList());
        Set<String> two = array.stream().filter(s -> s.startsWith("张")).filter(s -> s.length() == 3).collect(Collectors.toSet());

    }
}
