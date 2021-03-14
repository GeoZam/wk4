package com.fdmgroup.w4e5;


public class Library {

		public static void main(String[] args) {
			
			Book bookItem = new Book();
			bookItem.setId(12345678);
			bookItem.setName("Do Androids Dream of Electric Sheep?");
			
			Catalog<Book,Integer> bookCatalog = new Catalog<Book,Integer>();
			bookCatalog.addItem(bookItem);
			//Book returnedBook = bookCatalogue.getItem("9780575094185");
				
			
			Borrowers borrowers = new Borrowers();
			borrowers.setId(12345);
			borrowers.setName("Blade Runner");
			
			Catalog<Borrowers,Integer> borrowerCatalog = new Catalog<Borrowers,Integer>();
			borrowerCatalog.addItem(borrowers);
			//DVD returnedDVD = dvdCatalogue.getItem("B000G7P5NO");
			
			System.out.println(bookCatalog.getAllItems());
			System.out.println(borrowerCatalog.getAllItems());

		}

	}


