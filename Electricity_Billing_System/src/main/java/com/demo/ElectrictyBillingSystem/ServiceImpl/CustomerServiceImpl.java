package com.demo.ElectrictyBillingSystem.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.ElectrictyBillingSystem.Entities.Customer;
import com.demo.ElectrictyBillingSystem.Repository.CustomerRepository;
import com.demo.ElectrictyBillingSystem.Service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    // Retrieve all customers
    @Override
    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }

    // Retrieve a single customer by ID
    @Override
    public Customer getCustomer(long customerId) {
        Optional<Customer> customer = customerRepository.findById(customerId);
        return customer.orElse(null); // Return null if customer is not found
    }

    // Add a new customer
    @Override
    public Customer addCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    // Update an existing customer
    @Override
    public Customer updateCustomer(Customer customer) {
        if (customerRepository.existsById(customer.getCustomerId())) {
            return customerRepository.save(customer);
        }
        return null; // Return null if customer does not exist
    }

    // Delete a customer by ID
    @Override
    public void deleteCustomer(long customerId) {
        if (customerRepository.existsById(customerId)) {
            customerRepository.deleteById(customerId);
        }
    }
}
