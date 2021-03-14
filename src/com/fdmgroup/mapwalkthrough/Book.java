package com.fdmgroup.mapwalkthrough;

public class Book implements Comparable<Book>{
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
	public String getiSBN() {
		return iSBN;
	}
	public double getPrice() {
		return price;
	}
	
	//hashCode and equal are automatically generated from Source!
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((iSBN == null) ? 0 : iSBN.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (iSBN == null) {
			if (other.iSBN != null)
				return false;
		} else if (!iSBN.equals(other.iSBN))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	
	//
	@Override
	public int compareTo(Book otherBook) {
		if(this.price < otherBook.getPrice()){
			return -1;
		}
		else if(this.price > otherBook.price){
			return 1;
		}
		else{
			return 0;
		}
	}

}
