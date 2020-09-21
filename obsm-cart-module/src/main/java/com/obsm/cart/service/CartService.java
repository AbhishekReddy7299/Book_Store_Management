package com.obsm.cart.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.obsm.cart.exception.CartNotFound;
import com.obsm.cart.model.Admin;
import com.obsm.cart.model.CustomerCart;
import com.obsm.cart.payload.CartUpdateRequest;
import com.obsm.cart.repository.CartRepository;
import com.obsm.cart.utils.Helper;

@Service
@Transactional
public class CartService implements ICartService{
	
	@Autowired
    CartRepository cartRepository;
	
	@Override
	public ResponseEntity<CustomerCart> addCart(CustomerCart cart) {
		try {
			if (cart != null) {
				return new ResponseEntity<>(cartRepository.save(cart), HttpStatus.CREATED);
			} else throw new CartNotFound("Not a valid request");
		}catch(CartNotFound cartNotFound){
			return new ResponseEntity(HttpStatus.BAD_REQUEST);
		}
	}

	@Override
	public ResponseEntity<CustomerCart> updateCart(CustomerCart cart){
		try {
			if (cart != null) {
				return new ResponseEntity<>(cartRepository.save(cart), HttpStatus.CREATED);
			} else throw new CartNotFound("Not a valid request");
		}catch(CartNotFound cartNotFound){
			return new ResponseEntity(HttpStatus.BAD_REQUEST);
		}
	}
		 

	@Override
	public ResponseEntity<CustomerCart> getCart(long cartId) throws CartNotFound {
		try {
			CustomerCart cart = cartRepository.getOne(cartId);
			if(cartRepository.existsById(cartId))
				return new ResponseEntity<>(cart, HttpStatus.FOUND);
			else throw new CartNotFound("No cart is available");
		}catch (CartNotFound cartNotFound){
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}catch(Exception exception){
			return new ResponseEntity(HttpStatus.BAD_REQUEST);
		}
	}

	@Override
	public ResponseEntity<List<CustomerCart>> getAllCarts() {
		return new ResponseEntity(cartRepository.findAll(),HttpStatus.FOUND);
	}

	@Override
	public ResponseEntity deleteCart(long cartId) throws CartNotFound {
		try {
			CustomerCart deletedcart = cartRepository.getOne(cartId);
			if (cartRepository.existsById(cartId)) {
				cartRepository.delete(deletedcart);
				return new ResponseEntity(HttpStatus.OK);
			} else throw new CartNotFound("cart is Null");
		}catch (CartNotFound adminNotFound){
			return new ResponseEntity(HttpStatus.NOT_FOUND);
		}catch(Exception exception){
			return new ResponseEntity(HttpStatus.BAD_REQUEST);
		}
	}

}
