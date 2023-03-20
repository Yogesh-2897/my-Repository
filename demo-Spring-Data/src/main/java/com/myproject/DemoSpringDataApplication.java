package com.myproject;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.myproject.entity.Customer;
import com.myproject.service.CustomerService;

@SpringBootApplication
public class DemoSpringDataApplication implements CommandLineRunner {
	private static final Log LOGGER = LogFactory.getLog(DemoSpringDataApplication.class);
	@Autowired
	CustomerService customerService;
	public static void main(String[] args) {
		SpringApplication.run(DemoSpringDataApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*
		 * Customer c = customerService.getCustomerByEmailId("martin@infy.com");
		 * LOGGER.info(c);
		 */
		/*
		 * List<Customer> list =
		 * customerService.getCustomerByEmailIdOrNameOrderByDateOfBirthAsc(
		 * "martin@infy.com", "martin"); LOGGER.info(list);
		 */
		/*
		 * List<Customer> list =
		 * customerService.getCustomerByNameOrderByDateOfBirthDesc("martin");
		 * LOGGER.info(list);
		 */
		/*
		 * List<Customer> list = customerService.findByEmailIdLike("%@infy%");
		 * LOGGER.info(list);
		 */
		/*
		 * String name = customerService.findNameByEmailId("martin@infy.com");
		 * LOGGER.info(name);
		 */
		Integer id = customerService.updateCustomerEmailId("yogesh@123.com");
		LOGGER.info(id);
		
	}

}
