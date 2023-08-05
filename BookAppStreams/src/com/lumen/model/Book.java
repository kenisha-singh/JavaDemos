package com.lumen.model;

import java.util.Objects;

public class Book {
 private String author;
 private String category;
 private String title;
 private Integer bookId;
 private double price;
public Book() {
	super();
	// TODO Auto-generated constructor stub
}
public Book(String author, String category, String title, Integer bookId, double price) {
	super();
	this.author = author;
	this.category = category;
	this.title = title;
	this.bookId = bookId;
	this.price = price;
}
public Book(String string, String string2, String string3, int i, double d, Book book, Book book2, Book book3,
		Book book4) {
	
}
/**
 * @return the author
 */
public String getAuthor() {
	return author;
}
/**
 * @param author the author to set
 */
public void setAuthor(String author) {
	this.author = author;
}
/**
 * @return the category
 */
public String getCategory() {
	return category;
}
/**
 * @param category the category to set
 */
public void setCategory(String category) {
	this.category = category;
}
/**
 * @return the title
 */
public String getTitle() {
	return title;
}
/**
 * @param title the title to set
 */
public void setTitle(String title) {
	this.title = title;
}
/**
 * @return the bookId
 */
public Integer getBookId() {
	return bookId;
}
/**
 * @param bookId the bookId to set
 */
public void setBookId(Integer bookId) {
	this.bookId = bookId;
}
/**
 * @return the price
 */
public double getPrice() {
	return price;
}
/**
 * @param price the price to set
 */
public void setPrice(double price) {
	this.price = price;
}
@Override
public String toString() {
	return "Book [author=" + author + ", category=" + category + ", title=" + title + ", bookId=" + bookId + ", price="
			+ price + "]";
}


 
 
 
}
