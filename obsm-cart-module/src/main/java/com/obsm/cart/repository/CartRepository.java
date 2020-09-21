package com.obsm.cart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.obsm.cart.model.Admin;
import com.obsm.cart.model.CustomerCart;

@Repository
public interface CartRepository extends JpaRepository<CustomerCart, Long>{

}
