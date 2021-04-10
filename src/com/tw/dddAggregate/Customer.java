package com.tw.dddAggregate;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

//Root of the entity (Customer) it is exposed to client not Account
public class Customer {
    private UUID id = UUID.randomUUID();
    private Address address;
    private List<Account> accounts = new ArrayList<>();

    public Customer(Address address) {
        this.address = address;
    }

    public void updateAddress(Address newAddress) {
        this.address = newAddress;
        accounts.forEach(account -> {
            account.setAddress(newAddress);
        });
    }
}
// from java point this seems correct.
// do we need separate service ?