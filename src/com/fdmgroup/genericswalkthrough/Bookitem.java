package com.fdmgroup.genericswalkthrough;




public class Bookitem {

	public static void main(String[] args) {
		
		Book bookItem = new Book();
		bookItem.setUniqueId("9780575094185");
		bookItem.setName("Do Androids Dream of Electric Sheep?");
		
		Catalogue<Book> bookCatalogue = new Catalogue<Book>();
		bookCatalogue.addItem(bookItem);
		//Book returnedBook = bookCatalogue.getItem("9780575094185");
			
		
		DVD dvd = new DVD();
		dvd.setUniqueId("B000G7P5NO");
		dvd.setName("Blade Runner");
		
		Catalogue<DVD> dvdCatalogue = new Catalogue<DVD>();
		dvdCatalogue.addItem(dvd);
		//DVD returnedDVD = dvdCatalogue.getItem("B000G7P5NO");
		
		System.out.println(bookCatalogue.getAllItems());
		System.out.println(dvdCatalogue.getAllItems());

	}

}
