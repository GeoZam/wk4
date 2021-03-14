package com.fdmgroup.mapwalkthrough;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;





public class BookPriceComparator implements Comparator<Book>{
	@Override
	public int compare(Book book1, Book book2) {
		if(book1.getPrice()< book2.getPrice()){
			return -1;
		}
		else if(book1.getPrice()>book2.getPrice()){
			return 1;
		}
		else{
			return 0;
		}	
	}

	//use a set to sort orders.
	public static Set sortedBookSet(List<Book> bookList) {
		Set<Book> sortedBookSet = new TreeSet<Book>(new BookPriceComparator());
		for (Book book:bookList) {
			sortedBookSet.add(book);
		}
		System.out.println(sortedBookSet);
		return sortedBookSet;
	}
	
	public static void main(String[] args) {
		//instance 2 books
		Book book1 = new Book();
		book1.setPrice(12.00);
		book1.setNumberOfPages(100);
		Book book2 = new Book();
		book2.setPrice(15.00);
		book2.setNumberOfPages(300);
		
		
		//collections.sort requires first element to be a list!
		List<Book> bookList = new ArrayList();
		bookList.add(book1);
		bookList.add(book2);
		

		//compare prices of 2 books.
		BookPriceComparator comparator = new BookPriceComparator();
		//System.out.println(comparator.compare(book1,book2));

		//tree set to give an order.
		//sortedBookSet(bookList);
		
		//use collections to sort, by price or page numbers.
		Collections.sort(bookList, new BookPriceComparator());
		System.out.println(bookList);
		

	}



}
