package com.tw.ddd.domain.domain_service;

import com.tw.ddd.domain.Item;
import com.tw.ddd.domain.Price;

import java.util.HashMap;
import java.util.Map;

public class DiscountCalculator {
    private Map<String, Price> productVsPrice = new HashMap<String,Price>();

    public void calculateDiscount(Item item) {
        Price competitorPrice = productVsPrice.get(item.getProduct().getName());
        if(competitorPrice != null) {
            double currentPriceValue = item.getProduct().getPrice().getValue();
            item.getProduct().setPrice(new Price(currentPriceValue - 0.10*currentPriceValue));
        }
    }
}
