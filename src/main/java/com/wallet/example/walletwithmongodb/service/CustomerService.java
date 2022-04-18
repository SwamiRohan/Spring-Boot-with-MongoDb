package com.wallet.example.walletwithmongodb.service;

import com.wallet.example.walletwithmongodb.model.Customer;
import com.wallet.example.walletwithmongodb.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    public Customer addCustomer(Customer customer) {
        return customerRepository.save(customer);
    }


}
