package com.notjustmichael.repository.implement;

import com.notjustmichael.domain.items.Order;
import com.notjustmichael.repository.OrderRepository;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


@Repository("InMem3")
public class OrderRepositoryImp implements OrderRepository {

    private static OrderRepositoryImp repositoryImp = null;
    private Set<Order> orders;

    private OrderRepositoryImp() {
        this.orders = new HashSet<>();
    }

    public static OrderRepositoryImp getRepository(){
        if(repositoryImp == null) repositoryImp = new OrderRepositoryImp();
        return repositoryImp;
    }

    @Override
    public Order create(Order order) {
        orders.add(order);
        return order;
    }

    @Override
    public Order update(Order order) {
        orders.remove(order);
        orders.add(order);

        return order;
    }

    @Override
    public void delete(String s) {

        Iterator i = orders.iterator();
        Order temp;
        Order found = null;

        while (i.hasNext())
        {
            temp = ((Order)i.next());
            if(s.equals(temp.getOrdNo()))
            {
                found = temp;
            }

        }

        orders.remove(found);

    }

    @Override
    public Order read(String s) throws NullPointerException {

        Iterator i = orders.iterator();
        Order temp;
        Order found = null;

        while (i.hasNext())
        {
            temp = ((Order)i.next());
            if(s.equals(temp.getOrdNo()))
            {
                found = temp;
            }

        }

        return found;

    }

    @Override
    public Set<Order> getAll() {
        return null;
    }
}
