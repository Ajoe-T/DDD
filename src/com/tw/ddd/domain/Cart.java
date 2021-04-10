package com.tw.ddd.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Cart {
    private List<Item> items = new ArrayList<>();

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

}


// having id in product/item