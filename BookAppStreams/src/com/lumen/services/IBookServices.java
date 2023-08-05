package com.lumen.services;

import java.util.List;
import java.util.Set;

import com.lumen.exception.BookNotFoundException;
import com.lumen.model.Book;

public interface IBookServices {
	void addBook(Book book);
	List<Book> getAll();
	Set<Book> getByAuthorContains(String author) throws BookNotFoundException;
	Set<Book> getByCategory(String category) throws BookNotFoundException;
	Set<Book> getByPriceLessThan(double price) throws BookNotFoundException;
	Set<Book> getByAuthorContainsAndCategory(String author, String category) throws BookNotFoundException;
	Set<Book> getId(int bookId) throws BookNotFoundException;
	
}
