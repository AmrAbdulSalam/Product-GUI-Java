package com.company;

public class Product {
    private String bardcod;
    private String name;
    private Double price;
    private int quantity;

    public Product (){
        bardcod = "";
        name = "";
        price = 0.0;
        quantity = 0;
    }

    //functiones for setting the requierd data

    public void setBardcod(String bardcod){
        this.bardcod = bardcod;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setPrice(Double price){
        this.price = price;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    // fun for retreving the data

    public String getBardcod(){
        return this.bardcod;
    }
    public String getName(){
        return this.name;
    }
    public Double getPrice(){
        return this.price;
    }
    public int getQuantity(){
        return this.quantity;
    }


}
