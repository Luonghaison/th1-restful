package org.example.service;

import org.example.model.Customer;
import org.example.repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class CustomerServiceIMPL implements ICustomerService{
    @Autowired
    private ICustomerRepository customerRepository;
    @Override
    public Iterable findAll() {
        return customerRepository.findAll();
    }
    @Override
    public Optional findById(Long id) {
        return customerRepository.findById(id);
    }

    @Override
    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }
    @Override
    public void remote(Long id) {
customerRepository.deleteById(id);
    }
}
