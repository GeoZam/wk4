package com.fdm.bookShop;

public class ApplicationObj {

public static void main(String[] args) {
		Book book1 = new Book();
		book1.setTitle("Starship Troopers");

		Book book2 = new Book();
		book2.setTitle("The Man Who Was Thursday");
		swap(book1, book2);
System.out.println("Book 1 title: " + book1.getTitle());
System.out.println("Book 2 title: " + book2.getTitle());
	}
	
public static void swap(Book book1, Book book2){
		Book temp = book1;
		book1 = book2;
		book2 = temp;
	}

}