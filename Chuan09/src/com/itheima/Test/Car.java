package com.itheima.Test;

public class Car {
    private String brand;
    private int age;
    private double price;

    public Car() {
    }

    public Car(String brand, int age, double price) {
        this.brand = brand;
        this.age = age;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", age=" + age +
                ", price=" + price +
                '}';
    }
}
