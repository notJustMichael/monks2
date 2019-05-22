package com.notjustmichael.services.order;


import com.notjustmichael.domain.items.Order;
import com.notjustmichael.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("OrderServiceImpl")
public class OrderServiceImp implements OrderService {
    @Autowired
    @Qualifier("InMem3")
    private OrderRepository repository;

    @Override
    public Order create(Order order) {
        return repository.create(order);
    }

    @Override
    public Order update(Order order) {
        return repository.update(order);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);

    }

    @Override
    public Order read(String s) {
        return repository.read(s);
    }

    @Override
    public Set<Order> getAll() {
        return repository.getAll();
    }
}