package com.obsm.customer.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.obsm.customer.exception.CustomerNotFoundException;
import com.obsm.customer.model.Customer;
import com.obsm.customer.payload.CustomerUpdateRequest;

public interface ICustomerService {	
		public ResponseEntity<Customer> addCustomer(Customer customer);
		public ResponseEntity deleteCustomer(long customerId) throws CustomerNotFoundException;
		public ResponseEntity<Customer> updateCustomer(CustomerUpdateRequest customerUpdateRequest, long customerId) throws CustomerNotFoundException;
		public ResponseEntity<Customer> getCustomerById(long adminId) throws CustomerNotFoundException;
		public ResponseEntity<List<Customer>> getAllCustomer();

	}


