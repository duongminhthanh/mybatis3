package com.example.mybatissimple3.controller;

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
        return purchasingService.insert(purchasing);
    }
    /*list all*/
    @RequestMapping(value = "/purchasing",method = RequestMethod.GET)
    @ResponseBody
    public List<Purchasing> selectAllPurchasing(){
        return purchasingService.selectAllPurchasing();
    }
    /*update*/
    @RequestMapping(value="/purchasing/update/{id}",method = RequestMethod.PUT)
    @ResponseBody
    public int updatePurchaisngById(@PathVariable int id){
        return purchasingService.updatePurchasingById(id);
    }
    /*delete*/
    @RequestMapping(value="/purchasing/delete/{id}",method = RequestMethod.DELETE)
    @ResponseBody
    public int deletePurchaisngById(@PathVariable int id){
        return purchasingService.deletePurchasingById(id);
    }
    /*list by id*/
    @RequestMapping(value="/purchasing/{id}",method = RequestMethod.GET)
    @ResponseBody
    public Purchasing selectPurchaisngById(@PathVariable int id){
        return purchasingService.selectPurchasingById(id);
    }

    /*count all*/
    @RequestMapping(value = "/purchasing/count",method = RequestMethod.GET)
    @ResponseBody
    public int countAll(){
        return purchasingService.countAll();
    }
}
