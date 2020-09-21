package com.obsm.book.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.obsm.book.exception.BookNotFound;
import com.obsm.book.model.Book;
import com.obsm.book.payload.BookUpdateRequest;
import com.obsm.book.repository.IBookModuleRepo;
import com.obsm.book.utils.Helper;

@Service
@Transactional
public class BookModuleServiceImpl implements IBookModuleService {

	@Autowired
    IBookModuleRepo bookrepo;
	
	@Override
	public ResponseEntity<Book> addBook(Book book) {
		try {
			if (book != null) {
				return new ResponseEntity<>(bookrepo.save(book), HttpStatus.CREATED);
			} else throw new BookNotFound("Not a valid request");
		}catch(BookNotFound bookNotFound){
			return new ResponseEntity(HttpStatus.BAD_REQUEST);
		}
	}

	@Override
	public ResponseEntity deleteBook(long bookId) throws BookNotFound {
		try {
			Book deletedBook = bookrepo.getOne(bookId);
			if (bookrepo.existsById(bookId)) {
				bookrepo.delete(deletedBook);
				return new ResponseEntity(HttpStatus.OK);
			} else throw new BookNotFound("Book is Null");
		}catch (BookNotFound bookNotFound){
			return new ResponseEntity(HttpStatus.NOT_FOUND);
		}catch(Exception exception){
			return new ResponseEntity(HttpStatus.BAD_REQUEST);
		}
	}

	@Override
	public ResponseEntity<Book> updateBook(BookUpdateRequest bookUpdateRequest, long bookId) throws BookNotFound {
		try {
			Book updatedBook = bookrepo.getOne(bookId);
			if (!bookrepo.existsById(bookId)) {
				throw new BookNotFound("Book doesn't exists!");
			}
			Helper.copyBookDetails(updatedBook, bookUpdateRequest);
			return new ResponseEntity<>(bookrepo.save(updatedBook),HttpStatus.ACCEPTED);
		}catch(BookNotFound bookNotFound){
			return new ResponseEntity(HttpStatus.NOT_ACCEPTABLE);
		}
	}

	@Override
	public ResponseEntity<Book> getBook(long bookId) throws BookNotFound {
		try {
			Book book = bookrepo.getOne(bookId);
			if(bookrepo.existsById(bookId))
				return new ResponseEntity<>(book, HttpStatus.FOUND);
			else throw new BookNotFound("No book is available on this Id");
		}catch (BookNotFound bookNotFound){
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}catch(Exception exception){
			return new ResponseEntity(HttpStatus.BAD_REQUEST);
		}
	}

	@Override
	public ResponseEntity<List<Book>> getAllBooks() {
		return new ResponseEntity(bookrepo.findAll(),HttpStatus.FOUND);
	}

}
