package com.emobileconnect.application.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.emobileconnect.application.dao.CustomerRepository;
import com.emobileconnect.application.domain.Customer;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerRepository customerRepo;
	
	@GetMapping("/customers")
	public List<Customer> getAllCustomers(){
		return customerRepo.findAll();
	}
	
	@GetMapping("/customers/{customerId}")
	public Customer getByCustomerId(@PathVariable Long customerId){
		return customerRepo.findDistinctByCustomerId(customerId);
	}
	
//	@PostMapping("/newCustomer")
	@RequestMapping(value = "/newCustomer", method = RequestMethod.POST, headers = "Accept=application/json")
	public Customer newCustomer(@RequestBody Customer newCustomer) {
		return customerRepo.save(newCustomer);
	}
	
//	@PutMapping("/updateCustomer/{customerId}")
	@RequestMapping(value = "/updateCustomer/{customerId}", method = RequestMethod.PUT, headers = "Accept=application/json")
	public ResponseEntity<Customer> updateCustomer(@RequestBody Customer newCustomer, @PathVariable Long customerId) {	
		try {
			Customer  customerExists= customerRepo.findDistinctByCustomerId(customerId);
			if(customerExists == null) 
				customerRepo.save(newCustomer);	
				return new ResponseEntity<>(HttpStatus.OK);	
		} catch(NoSuchElementException e) {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}
		}

}
