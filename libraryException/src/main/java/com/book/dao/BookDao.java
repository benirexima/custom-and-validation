package com.book.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.book.model.Book;
import com.book.repository.BookRepository;

@Component
public class BookDao {
	
	@Autowired
	BookRepository bookRepository;
	
	
	public Book create (Book book) throws Exception {
		Book k=null;
		try
		{
		
		 k= bookRepository.save(book);
	} 
		catch (Exception e) {
			
			e.printStackTrace();
			throw e;
		}
			
	return k;

	}
	
	public List<Book>getAll(){
		return bookRepository.findAll();
	}
	
	public Long delete (Long bookid) 
	{
			bookRepository.deleteById(bookid);
			return bookid;
			
		}
		 
		
	public Book update(Book book) {	
	
	return bookRepository.save(book);
	
	}
}
