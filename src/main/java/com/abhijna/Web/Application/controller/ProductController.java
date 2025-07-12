package com.abhijna.Web.Application.controller;

import com.abhijna.Web.Application.model.Products;
import com.abhijna.Web.Application.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService service;
    @GetMapping("/products")
    public List<Products> getProducts(){
        return service.getproductlist();
    }


    @GetMapping("/products/{index}")
    public Products getproductID(@PathVariable int index){
        return service.getprodID(index);
    }


    // @RequestBody will help decide where to fetch the data from for the post request, we are getting it from postman body
    // If you want to bring out a product object with system.out.println(product prod),
    // then we should make a toString method in the Products class

    @PostMapping("/products")
    public String addproduct(@RequestBody Products addprod){

        service.addProducts(addprod);
        int length =service.getproductlist().size();
        if (service.getproductlist().get(length-1).getProductId() == addprod.getProductId()){
            return "Product added successfully";
        }
        return "Product not added";

    }

    @PutMapping("/products")
    public void updateProduct(@RequestBody Products prods){
        service.updateProduct(prods);
    }

    @DeleteMapping("/products/{id}")
    public void deleteProduct(@PathVariable int id){
        service.deleteProduct(id);
    }

//    @Autowired
//    ProductService updateprod;
//    @PutMapping("/products")
//    public String updateproduct(@RequestBody Products upprod){
//
//        return "Product Successfully updated";
//

}
