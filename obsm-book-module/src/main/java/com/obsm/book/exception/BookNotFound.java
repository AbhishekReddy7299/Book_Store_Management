package com.obsm.book.exception;

public class BookNotFound extends RuntimeException {
	public BookNotFound(String error){
        super(error);
    }

}
