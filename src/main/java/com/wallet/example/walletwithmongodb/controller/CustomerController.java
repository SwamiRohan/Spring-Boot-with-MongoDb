package com.wallet.example.walletwithmongodb.controller;


import com.wallet.example.walletwithmongodb.model.Customer;
import com.wallet.example.walletwithmongodb.service.CustomerService;
//import com.wallet.example.walletwithmongodb.service.SequenceGeneratorService;
import com.wallet.example.walletwithmongodb.service.SequenceGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @Autowired
    SequenceGeneratorService sequenceGenerator;

    @PostMapping("/addCustomer")
    public ResponseEntity<?> addCustomer(@RequestBody Customer customer){
        //customer.setCustomerId(sequenceGenerator.generateSequence(Customer.SEQUENCE_NAME));
        Customer userCreated = customerService.addCustomer(customer);
        return ResponseEntity.ok("Customer ID: "+ userCreated.getCustomerId()+"\n"
                +"Password: "+userCreated.getCustomerPassword());
    }

}
