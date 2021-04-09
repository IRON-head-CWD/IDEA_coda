package com.itheima.test01.test05;

public class furnitureFu {
    private String brand;
    private String size;
    private String colour;
    private int price;

    public furnitureFu() {
    }

    public furnitureFu(String brand, String size, String colour, int price) {
        this.brand = brand;
        this.size = size;
        this.colour = colour;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public static void refrigeratorShow(){
        System.out.println("门款式");
        System.out.println("制冷式");
    }
}
