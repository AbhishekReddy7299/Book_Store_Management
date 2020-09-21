package com.obsm.order.exception;

public class OrderNotFound extends RuntimeException {
	public OrderNotFound(String error){
        super(error);
    }
}
