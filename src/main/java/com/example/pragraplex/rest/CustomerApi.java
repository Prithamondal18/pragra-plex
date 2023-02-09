package com.example.pragraplex.rest;

import com.example.pragraplex.entity.Customer;
import com.example.pragraplex.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
@RequiredArgsConstructor
@RestController
public class CustomerApi {
    private CustomerService customerService;

    public CustomerApi(CustomerService customerService) {
        this.customerService = customerService;
    }
    @GetMapping("/api/customer")
    public List<Customer> getAll(){
    return customerService.getAllCustomer();
    }

    @PostMapping("/api/customer")
    public  Customer createCustomer (@RequestBody Customer customer){

        customer.setCreateDate((new Date()));
        customer.setUpdateDate((new Date()));
        return customerService.createCustomer(customer);
    }



}
