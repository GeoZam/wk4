package com.fdmgroup.mapwalkthrough;

import java.util.HashMap;
import java.util.Map;

public class Bookmap {
	
	//initializing and retrieving
	public static Map InitializeBook() {
		Map<String, Book> bookMap = new HashMap<String, Book>();
		//instance book1 and initialize its value.
		Book book1 = new Book();
		book1.setiSBN("1234567ABC");	
		//2 ways to get iSBN
		bookMap.put("1234567ABC", book1);
		System.out.println(bookMap);
		bookMap.put(book1.getiSBN(), book1);
		System.out.println(bookMap);
		//retrieve book using iSBN number.
		Book returnedBook = bookMap.get("1234567ABC");
		System.out.println(returnedBook);
		return bookMap;		
	}
	
	public static void CompareBooks() {
		Book book1 = new Book();
		book1.setiSBN("0-575-01587-X");
		book1.setTitle("Rendezvous with Rama");
		Book book2 = new Book();
		book2.setiSBN("0-575-01587-X");
		book2.setTitle("Rendezvous with Rama");
				
		boolean equals = book1.equals(book2);
		System.out.println(equals); //Will print out false????!!!But actually it returns true!

	}


	public static void main(String[] args) {
		InitializeBook();
		CompareBooks();

		
	
	}

}
