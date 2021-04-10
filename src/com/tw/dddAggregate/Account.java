package com.tw.dddAggregate;

import java.util.UUID;

public class Account {
    private UUID id = UUID.randomUUID();
    private Address address;

    public Account(Address address) {
        this.address = address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
