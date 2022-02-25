package com.example.mybatissimple3.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@JsonFormat(pattern="yyyy-MM-dd'T'HH:mm:ss")

public class Purchasing {
    private String purpose;

    private String provider;
    List<Products> products=new ArrayList<>();
    private double total;
    private int id;
    private String boughtDate;
    /*constructor*/

    public Purchasing(String purpose, String provider, double total, int id, String boughtDate) {
        this.purpose = purpose;
        this.provider = provider;
        this.total = total;
        this.id = id;
        this.boughtDate = boughtDate;
    }
    /*getter,setter*/

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public List<Products> getProducts() {
        return products;
    }

    public void setProducts(List<Products> products) {
        this.products = products;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBoughtDate() {
        return boughtDate;
    }

    public void setBoughtDate(String boughtDate) {
        this.boughtDate = boughtDate;
    }

}
