package com.example.mybatissimple3.model;

public class Products {
    private String name;
    private double price;
    private int amount;
    private int vat;
    private double totalPrice;
    private int id;
    /*constructor*/

    public Products(String name, double price, int amount, int vat, double totalPrice, int id) {
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.vat = vat;
        this.totalPrice = totalPrice;
        this.id = id;
    }

    /*getter,setter*/

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getVat() {
        return vat;
    }

    public void setVat(int vat) {
        this.vat = vat;
    }

    public double getTotalPrice() {
        return getAmount()*getPrice();
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
