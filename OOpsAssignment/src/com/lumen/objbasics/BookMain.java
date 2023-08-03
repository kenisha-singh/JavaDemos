package com.lumen.objbasics;

public class BookMain {
	
		public static void main(String[] args) {
			Book book1 = new Book("Theory of Everything","Stephen Hawking",800,"");
			book1.checkBookType();
			book1.getDetails();
			
			Book book2 = new Book("Half Girlfriend", "Chetan Bhagat", 300, "");
			book2.checkBookType();
			book2.getDetails();
			
			
		}
	}


