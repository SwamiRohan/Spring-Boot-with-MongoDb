package com.wallet.example.walletwithmongodb.repository;


import com.wallet.example.walletwithmongodb.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends MongoRepository<Customer, Long> {
    Customer findByCustomerId(long customerId);
}
