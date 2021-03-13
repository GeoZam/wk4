package com.fdmgroup.fizzbuzz.task2;

public class FizzBuzzRunner {
	public void fizzBuzz(int number){ 
		//code 
		for (int i = 1; i<=number; i++) {
//			if (i%3==0 && i%5==0) {
//				System.out.println(i+ "FizzBuzz");
//			}else if (i%3==0) {
//				System.out.println(i+ "Fizz");
//			}else if (i%5==0) {
//				System.out.println(i+ "Buzz");
//			}
			if (fizzbuzz(i)) {
				System.out.println(i+ "FizzBuzz");
			}else if (fizz(i)) {
				System.out.println(i+ "Fizz");
			}else if (buzz(i)) {
				System.out.println(i+ "Buzz");
			}
		}
		
		} 
	
	private boolean fizz(int number) {
		if (number%3==0) {
			return true;}
		else {
			return false;
		}
	}
	private boolean buzz(int number) {
		if (number%5==0) {
			return true;}
		else {
			return false;
		}
	}
	private boolean fizzbuzz(int number) {
		if (number%3==0 && number%5==0) {
			return true;}
		else {
			return false;
		}
	}
	
}
