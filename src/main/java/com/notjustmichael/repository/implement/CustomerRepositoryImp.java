package com.notjustmichael.repository.implement;

import com.notjustmichael.domain.customer.Customer;
        import com.notjustmichael.repository.CustomerRepository;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
        import java.util.Iterator;
        import java.util.Set;


@Repository("InMem2")
public class CustomerRepositoryImp implements CustomerRepository {

    private static CustomerRepositoryImp repositoryImp = null;
    private Set<Customer> customers;

    private CustomerRepositoryImp() {
        this.customers = new HashSet<>();
    }

    public static CustomerRepositoryImp getRepository(){
        if(repositoryImp == null) repositoryImp = new CustomerRepositoryImp();
        return repositoryImp;
    }

    @Override
    public Customer create(Customer customer) {
        customers.add(customer);
        return customer;
    }

    @Override
    public Customer update(Customer customer) {
        customers.remove(customer);
        customers.add(customer);

        return customer;
    }

    @Override
    public void delete(String s) {

        Iterator i = customers.iterator();
        Customer temp;
        Customer found = null;

        while (i.hasNext())
        {
            temp = ((Customer)i.next());
            if(s.equals(temp.getcPhNo()))
            {
                found = temp;
            }

        }

        customers.remove(found);

    }

    @Override
    public Customer read(String s) throws NullPointerException {

        Iterator i = customers.iterator();
        Customer temp;
        Customer found = null;

        while (i.hasNext())
        {
            temp = ((Customer)i.next());
            if(s.equals(temp.getcPhNo()))
            {
                found = temp;
            }

        }

        return found;

    }

    @Override
    public Set<Customer> getAll() {
        return null;
    }
}
