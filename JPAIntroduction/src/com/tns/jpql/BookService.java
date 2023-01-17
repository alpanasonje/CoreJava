package com.tns.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

public class BookService {
	private static EntityManager em;
	static {
		em = DAO.getEntityManager();
	}

	// list all the books of given author
	public static List<Book> getAllBooksByAuthor(String author) {
		List<Book> bookList;
		String str = "SELECT b FROM Book b WHERE b.author='" + author + "'";
		TypedQuery<Book> query = em.createQuery(str, Book.class);
		bookList = query.getResultList();
		return bookList;
	}

	// list all the books
	public static List<Book> getAllBooks() {
		List<Book> bookList;	
		TypedQuery<Book> query =  em.createNamedQuery("getAllBooks",Book.class);
		bookList = query.getResultList();
		return bookList;
	}

	// list all the books above given price
	public static List<Book> getAllBooks(int price) {
		List<Book> bookList;
		String str = "SELECT b FROM Book b WHERE b.price>" + price;
		TypedQuery<Book> query = em.createQuery(str, Book.class);
		bookList = query.getResultList();
		return bookList;
	}

	// list all the book of given title
	public static Book getBookByTitle(String title) {
		String qStr = "SELECT b FROM Book b WHERE b.title=:ptitle";
		TypedQuery<Book> query = em.createQuery(qStr, Book.class);
		query.setParameter("ptitle", title);
		Book book = query.getSingleResult();
		return book;
	}

	// list all the books within given price
	public static List<Book> getAllBooksWithinPriceRange(float startPrice, float endPrice) {

		String str = "SELECT b FROM Book b WHERE b.price BETWEEN :start AND :end";
		return em.createQuery(str, Book.class).setParameter("start", startPrice).setParameter("end", endPrice)
				.getResultList();

	}
}
