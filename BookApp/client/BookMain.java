package com.lumen.client;
import java.util.ArrayList;

import java.util.List;


import com.lumen.model.Book;
import com.lumen.services.BookServices;
import com.lumen.services.IBookService;
public class BookMain {
public static void main(String[] args)  {
	
	IBookService bookservices=new  BookServices();
	List<Book> books=new ArrayList<>();
	books=bookservices.getAll();
	System.out.println(books);
	
	books=bookservices.getByAuthorContains("Ben john");
	System.out.println(books);
	
	books=bookservices.getByCategory("Tech");
	System.out.println(books);

}
}
