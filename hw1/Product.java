package oop.example.seminar1.hw1;


public abstract class Product {
    protected static String name;
    protected static int price;

    public String getName() {
        return this.name;
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

}