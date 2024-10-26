package com.demo.ElectrictyBillingSystem.Service;

import java.util.List;

import com.demo.ElectrictyBillingSystem.Entities.Customer;



public interface CustomerService {
	 public List<Customer> getCustomers(); // Retrieve all users
	    public Customer getCustomer(long CustomerId); // Retrieve a single user
	    public Customer addCustomer(Customer customer); // Add a new user
	    public Customer updateCustomer(Customer customer); // Update an existing user
	    public void deleteCustomer(long customerId); // Delete a user
}
