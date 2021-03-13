package com.fdm.bookShop;

public class Book {
	private String title;
	private String author;
	private String iSBN;
	private double price;
	private int numberOfPages;
	public Book() {
		
	}
	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
}
	public void setTitle(String title) {
		this.title = title;
}
	public void setAuthor(String author) {
		this.author = author;
}
	public void setiSBN(String iSBN) {
		this.iSBN = iSBN;
}
	public void setPrice(double price) {
		this.price = price;
}
	
	public int getNumberOfPages() {
		return numberOfPages;
	}
	
	public String getTitle() {
		return title;
	}
	
	public double getPrice() {
		return price;
	}

}
