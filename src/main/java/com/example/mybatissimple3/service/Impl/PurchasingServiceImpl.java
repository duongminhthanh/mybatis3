package com.example.mybatissimple3.service.Impl;

import com.example.mybatissimple3.mapper.PurchasingMapper;
import com.example.mybatissimple3.model.Products;
import com.example.mybatissimple3.model.Purchasing;
import com.example.mybatissimple3.service.PurchasingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PurchasingServiceImpl implements PurchasingService {
    @Autowired
    private PurchasingMapper purchasingMapper;

    @Override
    public int insertPurchasing(Purchasing purchasing) {
        return purchasingMapper.insertPurchasing(purchasing);
    }

    @Override
    public List<Purchasing> selectAllPurchasing() {
        return purchasingMapper.selectAllPurchasing();
    }
}
