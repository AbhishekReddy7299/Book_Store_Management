package com.obsm.book.controller;

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

import com.obsm.book.exception.BookNotFound;
import com.obsm.book.model.Book;
import com.obsm.book.payload.BookUpdateRequest;
import com.obsm.book.service.IBookModuleService;

@RestController
@RequestMapping("/bookinfo")
public class BookController {
	@Autowired
	IBookModuleService service;


	@PostMapping("/addBook")
	public ResponseEntity<Book> addBook(@RequestBody Book book){
		return service.addBook(book);
	}

	@DeleteMapping("/deleteBook/{bookId}")
	public ResponseEntity deletebook(@PathVariable long bookId) throws BookNotFound {
		return service.deleteBook(bookId);
	}

	@PutMapping("/updateBook/{bookId}")
	public ResponseEntity<Book> updateBook(@RequestBody BookUpdateRequest bookUpdateRequest, @PathVariable long bookId) throws BookNotFound {
		return service.updateBook(bookUpdateRequest, bookId);
	}

	@GetMapping("/getBook/{bookId}")
	public ResponseEntity<Book> getBook(@PathVariable long bookId) throws BookNotFound {
		return service.getBook(bookId);
	}

	@GetMapping("/getAllBooks")
	public ResponseEntity<List<Book>> getAllBooks() {
		return service.getAllBooks();
	}

}
