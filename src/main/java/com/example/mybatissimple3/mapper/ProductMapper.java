package com.example.mybatissimple3.mapper;

import com.example.mybatissimple3.model.Products;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Mapper
@Service
public interface ProductMapper {
    public int insertProduct(Products products);
    public int updateProductById(int id,@Param("Obj") Products products);
    public int deleteProductById(int id);
    public List<Products> selectAllProduct();
    public Products selectProductById(int id);
    public int countAll();
}
