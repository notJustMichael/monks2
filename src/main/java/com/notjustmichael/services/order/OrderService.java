package com.notjustmichael.services.order;

import com.notjustmichael.domain.items.Order;
import com.notjustmichael.services.ServiceInterface;

import java.util.Set;

public interface OrderService extends ServiceInterface<Order,String> {
    Set<Order> getAll();
}
