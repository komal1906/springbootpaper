package com.cg.mvc.service;

import java.util.List;

import com.cg.mvc.beans.Customer;


public interface ICustomerService {

	public Customer addCustomer(Customer customer);
	public Customer findCustomer(int customerid);
	public Customer updateCustomer(Customer customer);
	public List<Customer> getCustomerList();
	public Customer removeCustomer(int custid);
}
