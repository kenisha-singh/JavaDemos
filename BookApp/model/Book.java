package com.lumen.model;

import java.time.LocalDate;

public class Book {
   
private String title;
   private String author;
   private String category;
   private Integer bookId;
   private double price;
   public Book(String string, String string2, String string3, int i, double d, LocalDate of) {
		
	}
public Book(String title, String author, String category, Integer bookId, double price) {
	super();
	this.title = title;
	this.author = author;
	this.category = category;
	this.bookId = bookId;
	this.price = price;
}
public Book() {
	super();
	// TODO Auto-generated constructor stub
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
	return "Book [title=" + title + ", author=" + author + ", category=" + category + ", bookId=" + bookId + ", price="
			+ price + "]";
}
   
}
