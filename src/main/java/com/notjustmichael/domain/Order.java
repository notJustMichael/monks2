package com.notjustmichael.domain;

import com.notjustmichael.domain.customer.Customer;
import com.notjustmichael.domain.items.Item;

import java.util.ArrayList;

public class Order {
    private String ordNo;
    private Customer customer;
    private ArrayList<Item> items;

    private Order(){}

    private Order (Builder builder)
    {
        this.ordNo = builder.ordNo;
        this.customer = builder.customer;

    }

    public static class Builder {
        private String ordNo;
        private Customer customer;
        private ArrayList<Item> items;


    }

}
