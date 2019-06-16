package com.sgic.library.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.library.entities.Book;
import com.sgic.library.repositories.BookRepository;

@Service
public class BookServiceImpl implements BookService{
	//private List<Book> bookList=new ArrayList<>();
@Autowired
BookRepository bookRepository;

public void saveBook(Book book) {
		bookRepository.save(book);
}

@Override
public List<Book> findAll() {
	List<Book> bookList =bookRepository.findAll();
	return bookList;
}

@Override
public Book getBookById(Long id) {
	return bookRepository.findBookById(id);
}

//@Override
//public void updateBook(Book book) {
//	bookRepository.save(book);
//	
//}

//public BookData getBookById(String id) {
//	ObjectMapper obj=new ObjectMapper();
//	obj.rea
//}
}
