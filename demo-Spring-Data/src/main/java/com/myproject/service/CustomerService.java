package com.myproject.service;

import java.util.List;

import com.myproject.entity.Customer;

public interface CustomerService {
	public Customer getCustomerByEmailId(String emailId);
	public List<Customer> getCustomerByEmailIdAndName(String emailID, String name);
	public List<Customer> getCustomerByEmailIdOrNameOrderByDateOfBirthAsc(String emailID, String name);
	public List<Customer> getCustomerByNameOrderByDateOfBirthDesc(String name);
	public List<Customer> findByEmailIdLike(String pattern);
	public String findNameByEmailId(String emailId);
	public Integer updateCustomerEmailId(String emailId);



}
