package com.tw.ddd.application;

import com.tw.ddd.domain.Cart;
import com.tw.ddd.domain.Item;
import com.tw.ddd.domain.Price;
import com.tw.ddd.domain.Product;

public class Runner {
    public static void main(String[] args) {
       Cart cart = new Cart();
       Cart cartTwo = new Cart();
       Product iPadPro = new Product("i pad pro", new Price(10));
//       Product heroInkPen = new Product("Hero ink Pen");
//       Product GMCricketBat = new Product("GM Cricket bat");

        Item itemOne = new Item(iPadPro, 1);
//        Item itemTwo = new Item(heroInkPen, 1);
//        Item itemThree = new Item(GMCricketBat, 2);

        double price= itemOne.getProduct().getPrice().getValue();
        System.out.println(price);
        cart.add(itemOne);
//        cart.add(itemTwo);
//        cart.add(itemThree);

//        cart.remove(itemThree);
        cartTwo.add(itemOne);
        System.out.println(cart.equals(cartTwo));
//        cart.getDeletedItems();
    }
}


// product + quantity = item
//remove item