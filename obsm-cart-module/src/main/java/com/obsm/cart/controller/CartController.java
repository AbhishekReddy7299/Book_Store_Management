package com.obsm.cart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.obsm.cart.exception.CartNotFound;
import com.obsm.cart.model.CustomerCart;
import com.obsm.cart.payload.CartUpdateRequest;
import com.obsm.cart.service.ICartService;

@RestController
@RequestMapping("/cart")
public class CartController {
	@Autowired
	ICartService service;
	
	@PostMapping("/addCart")
	public ResponseEntity<CustomerCart> addCart(@RequestBody CustomerCart cart){
		return (service.addCart(cart));
	}

	@DeleteMapping("/deleteCart/{cartId}")
	public ResponseEntity deletecart(@PathVariable long cartId) throws CartNotFound {
		return service.deleteCart(cartId);
	}

	@PutMapping("/updateCart/{cartId}")
	public ResponseEntity<CustomerCart> updateCart(@RequestBody CustomerCart cart) throws CartNotFound {
		return service.updateCart(cart);
	}

	@GetMapping("getCart/{cartId}")
	public ResponseEntity<CustomerCart> getTask(@PathVariable long cartId) throws CartNotFound {
		return service.getCart(cartId);
	}

	@GetMapping("/getAllCarts")
	public ResponseEntity<List<CustomerCart>> getAllCarts() {
		return service.getAllCarts();
	}
}
