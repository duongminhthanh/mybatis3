package com.example.mybatissimple3.mapper;

import com.example.mybatissimple3.model.Purchasing;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Mapper
@Service
public interface PurchasingMapper {
    public int insert(Purchasing purchasing);
    public List<Purchasing> selectAllPurchasing();
    public int updatePurchasingById(int id);
    public int deletePurchasingById(int id);
    public Purchasing selectPurchasingById(int id);
    public int countAll();
}
