/*
 * Q7. Write a method that uses a String method split to tokenize a line of text 
 * input by the user and places each token in a TreeSet. It should return the TreeSet. 
 * Note: Printing the TreeSet should output the elements ascending sorted order.
 */

package com.fdmgroup.w4e4;
import java.util.Scanner;
import java.util.TreeSet;

public class Q7TreeSet {
	
	public static TreeSet splitText(String input){
		TreeSet output = new TreeSet();
		String [] arr = input.split("\\s+");
		for (String i: arr) {
			output.add(i);
		}
		
		return output;
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your sentence here: ");
		String input = scanner.nextLine();
		System.out.println("The treeset is: " + splitText(input));
	}

}
