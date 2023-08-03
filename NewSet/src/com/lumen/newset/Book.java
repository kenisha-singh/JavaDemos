package com.lumen.newset;

public class Book {

	String title;
	String author;
	double price;
	public Book(String title, String author, double price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}
	void getDetails() {
		System.out.println("title: "+title);
		System.out.println("author: "+author);
		System.out.println("price: "+price);

	}
	void checkBookType(int price) {
		if(price>500)
			System.out.println("premium book");
		else
			System.out.println("standard book");
	}
	
}

