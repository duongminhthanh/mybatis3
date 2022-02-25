package com.example.mybatissimple3.service.Impl;

import com.example.mybatissimple3.mapper.ProductMapper;
import com.example.mybatissimple3.model.Products;
import com.example.mybatissimple3.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductMapper productMapper;

    public ProductServiceImpl() {
        super();
    }

    @Override
    public int insertProduct(Products products) {
        return productMapper.insertProduct(products);
    }

    @Override
    public int updateProductById(int id,Products products) {
        return productMapper.updateProductById(id,products);
    }

    @Override
    public int deleteProductById(int id) {
        return productMapper.deleteProductById(id);
    }

    @Override
    public List<Products> selectAllProduct() {
        return productMapper.selectAllProduct();
    }

    @Override
    public Products selectProductById(int id) {
        return productMapper.selectProductById(id);
    }

    @Override
    public int countAll() {
        return productMapper.countAll();
    }
}
