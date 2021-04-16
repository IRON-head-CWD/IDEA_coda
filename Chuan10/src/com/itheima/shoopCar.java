package com.itheima;

public class shoopCar {
    private String name;
    private int price;
    public shoopCar(){
    }

    public shoopCar(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        shoopCar shoopCar = (shoopCar) o;

        if (price != shoopCar.price) return false;
        return name != null ? name.equals(shoopCar.name) : shoopCar.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + price;
        return result;
    }

    @Override
    public String toString() {
        return "shoopCar{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
