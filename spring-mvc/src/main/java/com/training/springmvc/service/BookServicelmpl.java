package com.training.springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.springmvc.controllar.dao.BookRepository;
import com.training.springmvc.controllar.model.Book;




@Service
public class BookServicelmpl implements BookService{

	@Autowired
	BookRepository bookRepository;
	
	@Override
	public boolean createBook(Book book) {
		// TODO Auto-generated method stub
		
		Book b1 = bookRepository.save(book);
		if(b1 != null)
			return true;
		else {
			return false;
		}
	}

}