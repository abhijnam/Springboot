package com.abhijna.Web.Application.model;

import org.springframework.stereotype.Component;
import java.util.stream.Stream;

public class Products {

    public int productId;
    public String productName;
    public int productPrice;

    public Products(int productId, String productName, int productPrice) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public int getProductId(){

        return this.productId;
    }

    public String getProductName(){
        return this.productName;
    }
    public int getProductPrice(){
        return this.productPrice;
    }
    public void setProductId(int id){
        this.productId = id;
    }

    public void setProductname(String name){
        this.productName = name;
    }

    public void setProductprice(int price){
        this.productPrice = price;

    }
}
