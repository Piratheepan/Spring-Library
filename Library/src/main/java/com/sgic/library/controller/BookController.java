package com.sgic.library.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.library.entities.Book;
import com.sgic.library.services.BookService;

@RestController
@CrossOrigin
public class BookController {
	@Autowired
	BookService bookService;
	@PostMapping("/book")
 	public HttpStatus createBook(@Valid @RequestBody Book book) {
		bookService.saveBook(book);
	 	return HttpStatus.CREATED;
 }
	@GetMapping("/book")
 	public List<Book> getBooks() {
		List<Book> bookList=bookService.findAll();
	 	return bookList;
 }
	@GetMapping("/book/{id}")
	public Book getBookById(@PathVariable("id") Long id) {
		Book issueById=bookService.getBookById(id);
		return issueById;	
	}
//	@PutMapping("/book/{id}")
//	public Book getBookById1(@PathVariable("id") String id) {
//		Book issueById=bookService.saveBook(id);
//		return issueById;	
//	}
 
}
