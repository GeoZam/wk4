package com.fdm.bookShop;

public class Client {

	public static void main(String[] args) {
	
		int pages = 100; //it's not used
		Book book1 = new Book(); //instance of a new book
	     book1.setTitle("Head First Java");
	     book1.setAuthor("O'Reilly");
	     book1.setiSBN("0596009208");
	     book1.setPrice(25.99);
		 book1.setNumberOfPages(720);
		 
		Book book2 = new Book(); //instance of a new book
		 book2.setTitle("Java: How to Program");
		 book2.setAuthor("Deitel");
		 book2.setiSBN("0131364839");
		 book2.setPrice(29.99);
	     book2.setNumberOfPages(1560);
	    
	    Book book3 = new Book(); //instance of a new book
		 book3.setTitle("Head First Design Patterns");
		 book3.setAuthor("O'Reilly");
		 book3.setiSBN("0596007124");
		 book3.setPrice(22.49);
         book3.setNumberOfPages(694);
         
         Book[] books = {book1, book2, book3};
         
         Checkout mycheckout = new Checkout();
         double totalPrice = mycheckout.calculatePrice(books);

		 
		System.out.println(book1.getNumberOfPages());
		System.out.println("Total price of books: " + totalPrice);

	}

}
