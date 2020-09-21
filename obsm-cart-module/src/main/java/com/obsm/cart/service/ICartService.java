package com.obsm.cart.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.obsm.cart.exception.CartNotFound;

import com.obsm.cart.model.CustomerCart;
import com.obsm.cart.payload.CartUpdateRequest;

public interface ICartService {
	public ResponseEntity<CustomerCart> addCart(CustomerCart cart);
	public ResponseEntity deleteCart(long cartId) throws CartNotFound;
	public ResponseEntity<CustomerCart> getCart(long cartId) throws CartNotFound;
	public ResponseEntity<List<CustomerCart>> getAllCarts();
	ResponseEntity<CustomerCart> updateCart(CustomerCart cart);
}
