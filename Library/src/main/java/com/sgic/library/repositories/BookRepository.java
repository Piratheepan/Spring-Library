package com.sgic.library.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sgic.library.entities.Book;

public interface BookRepository extends JpaRepository<Book,Long>{
	Book findBookById(Long id);
	
}
