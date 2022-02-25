package com.example.mybatissimple3.mapper;

import com.example.mybatissimple3.model.Products;
import com.example.mybatissimple3.model.Purchasing;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Mapper
@Service
public interface PurchasingMapper {
    public int insertPurchasing(Purchasing purchasing);
    public List<Purchasing> selectAllPurchasing();
}
