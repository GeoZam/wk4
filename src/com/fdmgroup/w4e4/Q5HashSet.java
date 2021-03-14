/*
 * Q5: Write a method that returns the number of duplicate words in a sentence. 
 * Treat uppercase and lowercase letters the same. Ignore punctuation.
 * 
 * I'll go with HashSet
 */

package com.fdmgroup.w4e4;
import java.util.HashSet;
import java.util.Scanner;

public class Q5HashSet {
	
	public static int findDuplicate(String input) {
		HashSet words = new HashSet();
		int count = 0;
		//split input with space.
		String [] arr = input.split("\\s+");
		//convert words to lower case, and add to set if not already in there
		for (String i: arr) {
			if (words.contains((i.toLowerCase()))==true){
				count+=1;
			}else {
				words.add((i.toLowerCase()));
			}
		}
		return count;	
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your sentence here:");
		String input = scanner.nextLine();
		System.out.println(findDuplicate(input));
		

	}

}
