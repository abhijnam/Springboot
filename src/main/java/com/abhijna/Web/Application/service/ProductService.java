package com.abhijna.Web.Application.service;

import com.abhijna.Web.Application.model.Products;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class ProductService {
    List<Products> products = new ArrayList<>(Arrays.asList(new Products(101,"Iphone",50000),
            new Products(102,"canon camera",70000), new Products(103,"Microphone", 2000)));

    public List<Products> getproductlist(){

        return products;
    }

    public Products getprodID(int id) {
        return products.stream()
                .filter(p -> p.getProductId()==id)
                .findFirst().orElse(new Products(100,"no item",0));
        // or .findFirst().get();
// Using enhanced for Loop
        // Convert class to string for use
//        String itemID = "";
//        String itemname = "";
//        String itemprice = "";
//        for (Products product : products) {
//            if (product.getProductId() == id) {
//                itemID = Integer.toString(product.getProductId());
//                itemname = product.getProductname();
//                itemprice = Integer.toString(product.getProductprice());
//                return "Item ID: " + itemID + "\n" + "Item name: " + itemname + "\n" + "item price: " + itemprice;
//            }
//            }
//        return "Product ID not found";

    }
    public void addProducts(Products prod){
        products.add(prod);
    }
    public void updateProduct (Products upprod){
        for (Products product : products) {
            if (product.getProductId() == upprod.getProductId()) {
                product.setProductname(upprod.getProductName());
                product.setProductprice(upprod.getProductPrice());
            }
            }
        // can also use products.set(index, upprod)

    }

    public void deleteProduct(int id){
        for(int i = 0; i < products.size();i++){
            if (products.get(i).getProductId() == id){
                products.remove(products.get(i));
            }
        }
    }


}
