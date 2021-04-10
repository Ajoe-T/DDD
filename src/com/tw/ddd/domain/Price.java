package com.tw.ddd.domain;

import java.util.Currency;

public class Price {
    private double value;
    private Currency currency = Currency.getInstance("INR");

    public Price(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
