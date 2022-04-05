package com.springdemo.springproject.model;

public class Product {

    public  int id;
    public  String name;
    public int batchNo;
    public  int price;
    public int noOfProduct;

    public Product(){

    }

    public Product(int id, String name, int batchNo, int price, int noOfProduct) {
       super();
        this.id = id;
        this.name = name;
        this.batchNo = batchNo;
        this.price = price;
        this.noOfProduct = noOfProduct;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(int batchNo) {
        this.batchNo = batchNo;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNoOfProduct() {
        return noOfProduct;
    }

    public void setNoOfProduct(int noOfProduct) {
        this.noOfProduct = noOfProduct;
    }
}
