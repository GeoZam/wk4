package com.fdm.application;

public class Application {

	public static void main(String[] args) {
		int i = 10;
		int j = 5;
		swap(i,j);
		System.out.println("i is equal to: " + i);
		System.out.println("j is equal to:"  + j);
	}
	
	public static void swap(int i, int j){
		int temp = i;
		i=j;
		j=temp;
	}

}