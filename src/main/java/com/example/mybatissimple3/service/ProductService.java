package com.example.mybatissimple3.service;

import com.example.mybatissimple3.model.Products;

import java.util.List;

public interface ProductService {
    public int insertProduct(Products products);
    public int updateProductById(int id,Products products);
    public int deleteProductById(int id);
    public List<Products> selectAllProduct();
    public Products selectProductById(int id);
    public int countAll();
}
