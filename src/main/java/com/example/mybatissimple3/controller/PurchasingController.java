package com.example.mybatissimple3.controller;

import com.example.mybatissimple3.model.Products;
import com.example.mybatissimple3.model.Purchasing;
import com.example.mybatissimple3.service.PurchasingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PurchasingController {
    @Autowired
    private PurchasingService purchasingService;
    /*create*/
    @RequestMapping(value = "/purchasing/insert",method = RequestMethod.POST)
    @ResponseBody
    public int insertPurchasing(@RequestBody Purchasing purchasing){
        return purchasingService.insertPurchasing(purchasing);
    }
    /*list all*/
    @RequestMapping(value = "/purchasing",method = RequestMethod.GET)
    @ResponseBody
    public List<Purchasing> selectAllPurchasing(){
        return purchasingService.selectAllPurchasing();
    }
}
