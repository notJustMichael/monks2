package com.notjustmichael.repository;

import com.notjustmichael.domain.items.Order;

import java.util.Set;

public interface OrderRepository extends RepositoryInterface<Order, String>
{
    Set<Order> getAll();
}
