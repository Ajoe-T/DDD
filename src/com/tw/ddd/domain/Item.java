package com.tw.ddd.domain;

public class Item {
    private Product product;
    private  int quantity;
    private Boolean status = true;

    public Item(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Boolean getStatus() {
        return status;
    }

    public Product getProduct() {
        return product;
    }
}


// two collections
// active/inactive fields