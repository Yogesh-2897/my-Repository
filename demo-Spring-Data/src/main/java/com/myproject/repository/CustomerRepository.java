package com.myproject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.myproject.entity.Customer;

import jakarta.transaction.Transactional;

public interface CustomerRepository extends CrudRepository<Customer,Integer>{
	//Query creation based on method name - Demo
	public Customer getCustomerByEmailId(String emailId);
	public List<Customer> getCustomerByEmailIdAndName(String emailID, String name);
	public List<Customer> getCustomerByEmailIdOrNameOrderByDateOfBirthAsc(String emailID, String name);
	public List<Customer> getCustomerByNameOrderByDateOfBirthDesc(String name);
	public List<Customer> findByEmailIdLike(String pattern);
	
	//Query creation using @Query - Demo
	@Query("Select c.name from Customer c where c.emailId = ?1")
	public String findNameByEmailId(@Param("1") String emailId);
	
	
	@Query("Update Customer c SET c.emailId = ?1 where c.customerId=1")
	@Modifying
	@Transactional
	public Integer updateCustomerEmailId(@Param("1") String emailId);

}
