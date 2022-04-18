package com.wallet.example.walletwithmongodb.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;


// Document represent the table same like entity
@Document(collection = "customer")
public class Customer {
    @Transient
    public static final String SEQUENCE_NAME = "users_sequence";
    @Id
    private long customerId;
    private String customerName;
    private String customerMail;
    private int customerNumber;
    private String customerPassword;

    public Customer(int customerId, String customerName, String customerMail, int customerNumber, String customerPassword) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerMail = customerMail;
        this.customerNumber = customerNumber;
        this.customerPassword = customerPassword;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerMail() {
        return customerMail;
    }

    public void setCustomerMail(String customerMail) {
        this.customerMail = customerMail;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getCustomerPassword() {
        return customerPassword;
    }

    public void setCustomerPassword(String customerPassword) {
        this.customerPassword = customerPassword;
    }
}
