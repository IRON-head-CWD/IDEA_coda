package com.itheima.Test02;

//import com.itheima.Test.Test;

public class Test07 {
    private  String brand;
    private int price;

    public Test07(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Test07{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Test07 test07 = (Test07) o;

        if (price != test07.price) return false;
        return brand != null ? brand.equals(test07.brand) : test07.brand == null;
    }

    @Override
    public int hashCode() {
        int result = brand != null ? brand.hashCode() : 0;
        result = 31 * result + price;
        return result;
    }
}
