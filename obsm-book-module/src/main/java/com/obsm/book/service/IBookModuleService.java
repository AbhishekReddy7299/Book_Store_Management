package com.obsm.book.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.obsm.book.exception.BookNotFound;
import com.obsm.book.model.Book;
import com.obsm.book.payload.BookUpdateRequest;


public interface IBookModuleService {
	public ResponseEntity<Book> addBook(Book book);
	public ResponseEntity deleteBook(long bookId) throws BookNotFound;
	public ResponseEntity<Book> updateBook(BookUpdateRequest bookUpdateRequest, long bookId) throws BookNotFound;
	public ResponseEntity<Book> getBook(long bookId) throws BookNotFound;
	public ResponseEntity<List<Book>> getAllBooks();

}
