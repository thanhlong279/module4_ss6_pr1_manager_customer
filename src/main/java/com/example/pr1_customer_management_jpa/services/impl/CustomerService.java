package com.example.pr1_customer_management_jpa.services.impl;

import com.example.pr1_customer_management_jpa.models.Customer;
import com.example.pr1_customer_management_jpa.repositories.ICustomerRepository;
import com.example.pr1_customer_management_jpa.repositories.impl.CustomerRepository;
import com.example.pr1_customer_management_jpa.services.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements ICustomerService {
    @Autowired
    private ICustomerRepository iCustomerRepository;

    @Override
    public List<Customer> findAll() {
        return iCustomerRepository.findAll();
    }

    @Override
    public void save(Customer customer) {
        iCustomerRepository.save(customer);
    }

    @Override
    public Customer findById(Long id) {
        return iCustomerRepository.findById(id);
    }

    @Override
    public void remove(Long id) {
        iCustomerRepository.remove(id);
    }
}
