package com.lumen.objbasics;

public class Book {
	
		String title;
		String author;
		double price;
		String category;
		
		public Book(String title, String author, double price, String category) {
			super();
			this.title = title;
			this.author = author;
			this.price = price;
			this.category = category;
		}
		
		void getDetails() {
			System.out.println("Title : "+title+", Author :  "+author+", Price : "+price+", Category : "+category);
		}
		
		
		void checkBookType() {
			if(price>500) {
				category="Premium Book";
			}else {
				category="Standard Book";
			}
		}
		
		
	}

