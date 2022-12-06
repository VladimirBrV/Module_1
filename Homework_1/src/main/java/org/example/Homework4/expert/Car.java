package org.example.Homework4.expert;

public class Car {
    private int price;

    public Car() {
    }

    public Car(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void showPrice() {System.out.println(getPrice());}
}
