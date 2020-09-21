package com.obsm.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

import com.obsm.customer.model.Customer;

@RestController
public interface CustomerRepo extends JpaRepository<Customer, Long> {

}
