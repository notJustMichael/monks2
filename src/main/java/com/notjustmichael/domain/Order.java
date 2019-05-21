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
        this.items = items;

    }

    public static class Builder {
        private String ordNo;
        private Customer customer;
        private ArrayList<Item> items;

        public Builder ordNo (String ordNo)
        {
            this.ordNo = ordNo;
            return this;
        }

        public Builder customer (Customer customer)
        {
            this.ordNo = ordNo;
            return this;
        }

        public Builder items (ArrayList<Item> items)
        {
            this.items = items;
            return this;
        }


    }

    public String getOrdNo() {
        return ordNo;
    }

    public Customer getCustomer() {
        return customer;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public double getOrderTotal (ArrayList<Item> items)
    {
        double ordTotal = 0;
        for(Item i : items)
        {
            ordTotal = ordTotal + i.getPrice();
        }
        return ordTotal;
    }

    @Override
    public String toString() {


        return "Order "+ordNo+"\nCustomer name: "+customer.getcName()+"\nDelivery Address: "+customer.getcAddress()
                +"\nOrder Total: R"+getOrderTotal(items);
    }
}
