package com.obsm.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.obsm.book.model.Book;

@Repository
public interface IBookModuleRepo extends JpaRepository<Book, Long>{

}
