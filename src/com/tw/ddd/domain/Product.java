package com.tw.ddd.domain;

public class Product {
    private String name;
    private Price price;

    public Product(String name, Price price) {
        this.name = name;
        this.price = price;
    }

    public Price getPrice() {
        return price;
    }
}





//com.tw.ddd.domain.Item or Product - terminology
//clients should give name
//use what bs uses