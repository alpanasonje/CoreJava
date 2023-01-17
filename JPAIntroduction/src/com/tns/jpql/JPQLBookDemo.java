package com.tns.jpql;

import java.util.List;

public class JPQLBookDemo {

	public static void main(String[] args) {
		List<Book> bookList;
		bookList=BookService.getAllBooks();
		System.out.println(bookList);
		System.out.println("-----------------------------");
		bookList=BookService.getAllBooksByAuthor("Y B Kanetkar");
		System.out.println(bookList);
		System.out.println("-----------------------------");
		bookList=BookService.getAllBooks(1000);
		System.out.println(bookList);
		System.out.println("-----------------------------");
		Book book=BookService.getBookByTitle("Shamchi Aai");
		System.out.println(book);
		System.out.println("-----------------------------");
		bookList=BookService.getAllBooksWithinPriceRange(1000f, 1600f);
		System.out.println(bookList);

	}

}
