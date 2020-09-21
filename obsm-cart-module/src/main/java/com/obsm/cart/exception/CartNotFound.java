package com.obsm.cart.exception;

public class CartNotFound extends RuntimeException {
	public CartNotFound(String error){
        super(error);
    }
}
