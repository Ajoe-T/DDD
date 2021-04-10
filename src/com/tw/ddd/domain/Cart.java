package com.tw.ddd.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Cart {
    private List<Item> items = new ArrayList<>();
    private Map<String,Price> productVsPrice = new HashMap<String,Price>();
    private boolean isCheckedOut = false;

    public void add(Item item) {
        items.add(item);
    }

    public void remove(Item item) {
        item.setStatus(false);
        items.remove(item);
    }

    public List<Item> getItems(){
        return items.stream().filter(Item::getStatus).collect(Collectors.toList());
    }

    public List<Item> getDeletedItems(){
        return items.stream().filter(item -> !item.getStatus()).collect(Collectors.toList());
    }

    public Order checkout() {
        this.isCheckedOut = true;
        List<Product> products = items.stream().map(Item::getProduct).collect(Collectors.toList());
        return new Order(products);
    }

}


// having id in product/item