package com.lumen.services;

import java.util.ArrayList;
import java.util.List;

import com.lumen.exception.BookNotFoundException;
import com.lumen.model.Book;
import com.lumen.util.BookDetails;

public class BookServices  implements IBookService{

	@Override
	public void addBook(Book book) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Book> getAll() {
		List<Book> books = BookDetails.showBooks();
		return books ;
	}

	@Override
	public List<Book> getByAuthorContains(String author) throws BookNotFoundException {
		List<Book> books = getAll();
		ArrayList<Book> getbyauthorcontains = new ArrayList<>();
		for( Book book:books) {
			if(book.getAuthor().equals(author)) {
				getbyauthorcontains.add(book);
			}
		}
		return getbyauthorcontains ;
	}

	@Override
	public List<Book> getByCategory(String category) throws BookNotFoundException {
		List<Book> books = getAll();
		ArrayList<Book> getbycategory= new ArrayList<>();
		for(Book book:books) {
			if(book.getCategory().equals(category))
				getbycategory.add(book);
		}
			return getbycategory;

	}

	@Override
	public List<Book> getByPriceLessThan(double price) throws BookNotFoundException {
	
		List<Book> books=getAll();
		ArrayList<Book> getbypricelessthan=new ArrayList<>();
		for(Book book:books) {
			if(book.getPrice()>=price) {
				getbypricelessthan.add(book);
				
			}
		}
		return getbypricelessthan;
	}

	public List<Book> getByAuthorContainsAndCategory(String author, String category) throws BookNotFoundException {
		List<Book> books=getAll();
		ArrayList<Book> getbyauthorcontainsandcategory=new ArrayList<>();
		for(Book book:books) {
			if(book.getAuthor().equals(author)){
				if(book.getCategory().equals(category)) {
					getbyauthorcontainsandcategory.add(book);
					
				}
			}
		}
		
		return getbyauthorcontainsandcategory;
	}
	@Override
	public Book getById(int bookid) throws BookNotFoundException {
		List<Book> books=getAll();
		List<Book> getbyid=new ArrayList<>();
		for(Book book:books) {
			if(book.getBookId().equals(bookid)){
				getbyid.add(book);
			}
		}
		return (Book) getbyid;
	}

}