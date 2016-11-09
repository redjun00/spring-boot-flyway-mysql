package com.example.web;

import com.example.entity.domain.Customer;
import com.example.entity.repository.CustomerRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Transactional
@Service
public class CustomerService {

    @Resource
    private CustomerRepository customerRepository;


    public List<Customer> getCustomer(){
        return customerRepository.findAll();
    }
}
