package com.example.mybatissimple3.controller;

import com.example.mybatissimple3.model.Products;
import com.example.mybatissimple3.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;
    /*create*/
    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    @ResponseBody
    public int insertProduct(@RequestBody Products products){
        return productService.insertProduct(products);
    }
    /*update*/
    @RequestMapping(value = "/products/update/{id}",method = RequestMethod.PUT)
    @ResponseBody
    public int updateProductById(@PathVariable int id,@RequestBody Products products){
        return productService.updateProductById(id,products);
    }
    /*delete*/
    @RequestMapping(value = "/products/delete/{id}",method = RequestMethod.DELETE)
    @ResponseBody
    public int deleteProductById(@PathVariable int id){
        return productService.deleteProductById(id);
    }
    /*list all*/
    @RequestMapping(value = "/products",method = RequestMethod.GET)
    @ResponseBody
    public List<Products> selectAllProduct(){
        return productService.selectAllProduct();
    }
    /*list by id*/
    @RequestMapping(value = "/products/{id}",method = RequestMethod.GET)
    @ResponseBody
    public Products selectProductById(@PathVariable int id) {
        return productService.selectProductById(id);
    }
    /*count all*/
    @RequestMapping(value = "/count",method = RequestMethod.GET)
    @ResponseBody
    public int countAll(){
        return productService.countAll();
    }
}
