package com.sgic.library.services;


import java.util.List;



import com.sgic.library.entities.Book;



public interface BookService {
	
void saveBook(Book book);

public List<Book> findAll();

Book getBookById(Long id);

//void updateBook(Book book);

}
