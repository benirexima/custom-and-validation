package com.book.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.dao.BookDao;
import com.book.model.Book;
import com.book.validation.FieldValidation;

@Service
public class BookService {
	
	
	@Autowired
	FieldValidation fieldvalidation;
	
	@Autowired
	BookDao bookDao;
	
	
	public Book create (Book book) throws Exception {
		Book b = null;
		 try {
			 b=FieldValidation.validPrice(book);
			 System.out.println(book.getPrice());
			 
			 b=FieldValidation.findAuthorName(book);
			 System.out.println(book.getAuthorname());
			 
			 b= bookDao.create(book);
		} 
		 catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return b;
	}
	public List<Book> getAllBook()
	{
		return bookDao.getAll();
		
	}
	
	public void delete(Long bookid) 
	{
		bookDao.delete(bookid);
	}
		
	public void update(Book book) 
	{
		
		bookDao.update(book);
	}
}
