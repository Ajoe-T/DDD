package com.tw.ddd.domain;

import java.util.List;

public class Order {
    List<Product> products;

    public Order(List<Product> products) {
        this.products = products;
    }
}
