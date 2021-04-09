package com.itheima.Demo004;

public class girlFriend01 {
    //封装
    private String name;
    private int height, weight;
//空参
    public girlFriend01() {
    }
//实参
    public girlFriend01(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void show() {
        System.out.println("我女朋友叫" + name + ",身高" + height + "厘米,体重" + weight + "斤");
    }

    public void wash() {
        System.out.println("女朋友帮我洗衣服");
    }

    public void cook() {
        System.out.println("女朋友给我做饭");
    }

}
