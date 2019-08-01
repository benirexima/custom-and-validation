package com.book.validation;

import javax.naming.NameNotFoundException;

import org.springframework.stereotype.Component;

import com.book.model.Book;


@Component
public class FieldValidation {
	
	
public static Book validPrice(Book book) throws Exception {
		
		double price=book.getPrice();

		if (price >= 150 && price<= 500)
			
			System.out.println("book is added");
		
		else
			throw new Exception("price is not between 150 and 500");
		return book;
					
	}
	public static Book findAuthorName (Book book) throws NameNotFoundException{ 
		
		
		String authorName=book.getAuthorname();
		
		if ("aravinth".equals(authorName)) 
			
			System.out.println("author name is correct");
		
		else
			
            throw new NameNotFoundException("Name is not match!");
		return book;
        
	}
	

}
