package com.obsm.admin.exception;

public class AdminNotFound extends RuntimeException {
	public AdminNotFound(String error){
        super(error);
    }
}
