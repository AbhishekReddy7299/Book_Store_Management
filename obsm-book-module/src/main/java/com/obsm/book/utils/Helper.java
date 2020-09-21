package com.obsm.book.utils;

import com.obsm.book.model.Book;
import com.obsm.book.payload.BookUpdateRequest;

public class Helper {
	public static void copyBookDetails(Book book, BookUpdateRequest bookRequest) {
        if (bookRequest.getPrice()!= 0)
        	book.setPrice(bookRequest.getPrice());
        if (bookRequest.getRating()!= 0)
        	book.setRating(bookRequest.getRating());
   
    }
}
