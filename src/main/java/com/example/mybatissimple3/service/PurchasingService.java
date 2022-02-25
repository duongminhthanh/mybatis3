package com.example.mybatissimple3.service;

import com.example.mybatissimple3.model.Purchasing;

import java.util.List;


public interface PurchasingService {
    public int insertPurchasing(Purchasing purchasing);
    public List<Purchasing> selectAllPurchasing();

}
