//Write a generic class Pair which has two type parameters representing the type of 
//the first and second element of the pair. Add getters and setters for each.

package com.fdmgroup.w4e5;

public class Pair <E> {
	private E e;
	public void set(E e) {
		this.e=e;
	}
	public E get() {
		return e;
	}
	
	

	public static void main(String[] args) {
		Pair<Integer> integerPair= new Pair<Integer>();
		Pair<String> stringPair= new Pair<String>();
		integerPair.set(10);
		stringPair.set("Hello!");
		System.out.println(integerPair.get());
		System.out.println(stringPair.get());

	}

}
