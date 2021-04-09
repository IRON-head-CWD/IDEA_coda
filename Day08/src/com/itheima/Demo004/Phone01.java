package com.itheima.Demo004;

public class Phone01 {
   private   String brand;
    private String color;
    private int price;

    public Phone01(String brand, String color, int price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }



    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Phone01{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
