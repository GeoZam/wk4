package com.fdm.bookShop;

public class Checkout {
	public double calculatePrice(Book[] books){
		
		//for loop
		double priceTotal = 0.0;
		for(int i  = 0; i< books.length; i++){
			priceTotal += books[i].getPrice();
		}
		return priceTotal;
		
		//for each loop
//		double priceTotal = 0;
//		for(Book temp: books ){
//			priceTotal += temp.getPrice();
//		}
//		return priceTotal;
		
		//while loop
//		double priceTotal = 0;
//		int i = 0;
//		while(i<books.length){
//			priceTotal += books[i].getPrice();
//			i++;
//		}		
//		return priceTotal;


}


}
