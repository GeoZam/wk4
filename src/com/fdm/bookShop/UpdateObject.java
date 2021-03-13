package com.fdm.bookShop;

public class UpdateObject {

	public static void main(String[] args) {
		Book book = new Book();
		book.setTitle("Ender's Game");
		updateTitle(book);
System.out.println("Book title is: " + book.getTitle());
	}
	
	public static void updateTitle(Book book){
		book.setTitle("Dune");
	}
}