package com.myproject.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myproject.entity.Customer;
import com.myproject.repository.CustomerRepository;

import jakarta.transaction.Transactional;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	CustomerRepository customerRepository;

	@Override
	public Customer getCustomerByEmailId(String emailId) {
		Customer c = customerRepository.getCustomerByEmailId(emailId);
		
		return c;
	}

	@Override
	public List<Customer> getCustomerByEmailIdAndName(String emailID, String name) {
		List<Customer> list = customerRepository.getCustomerByEmailIdAndName(emailID, name);
		return list;
	}

	@Override
	public List<Customer> getCustomerByEmailIdOrNameOrderByDateOfBirthAsc(String emailID, String name) {
		List<Customer> list = customerRepository.getCustomerByEmailIdOrNameOrderByDateOfBirthAsc(emailID, name);
		return list;
	}

	@Override
	public List<Customer> getCustomerByNameOrderByDateOfBirthDesc(String name) {
		List<Customer> list = customerRepository.getCustomerByNameOrderByDateOfBirthDesc( name);
		return list;
	}

	@Override
	public List<Customer> findByEmailIdLike(String pattern) {
		List<Customer> list = customerRepository.findByEmailIdLike(pattern);
		return list;
	}

	@Override
	public String findNameByEmailId(String emailId) {
		String name = customerRepository.findNameByEmailId(emailId);
		return name;
	}

	@Override
	public Integer updateCustomerEmailId(String emailId) {
		Integer id = customerRepository.updateCustomerEmailId(emailId);
		Customer c = customerRepository.getCustomerByEmailId(emailId);
		return c.getCustomerId();
	}

}
