package com.notjustmichael.factory;

import com.notjustmichael.domain.items.Order;
import com.notjustmichael.domain.customer.Customer;
import com.notjustmichael.domain.items.Item;

import java.util.ArrayList;

public class OrderFactory {

    public static Order createOrder(String ordNo, Customer customer, ArrayList<Item> items)
    {
        return new Order.Builder()
                .ordNo(ordNo)
                .customer(customer)
                .items(items)
                .build();
    }

}
