package com.itheima.test01.test05;

public class laundryZi extends furnitureFu {
    private String Kind;
    private String capacity;
    private String TVSize;
    private String resolution;

    public laundryZi(String brand, String size, String colour, int price) {
        super(brand, size, colour, price);
    }

    public laundryZi(String brand, String size, String colour, int price, String kind, String capacity, String TVSize, String resolution) {
        super(brand, size, colour, price);
        this.Kind = kind;
        this.capacity = capacity;
        this.TVSize = TVSize;
        this.resolution = resolution;
    }
    public static void laundryZiShow(){
        System.out.println("电机类型");
        System.out.println("洗涤容量");
        System.out.println("屏幕尺寸");
        System.out.println("洗涤分辨率");
    }
}

