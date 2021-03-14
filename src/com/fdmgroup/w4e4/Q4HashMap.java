/*Write a method to count the number of occurrences of each letter in a string. 
 * For example, the string "HELLO THERE" contains two Hs, three Es, two Ls, one O, one T 
 * and one R. It should return an object that contains the results – what kind of class is 
 * best suited for this?
 * 
 *I'll choose HashMap, use the letter as key, the count as value.
 */

package com.fdmgroup.w4e4;
import java.util.HashMap;
import java.util.Scanner;

public class Q4HashMap {
	
	public static HashMap letterCount(String input) {
		HashMap<Character,Integer> lettercount = new HashMap();
		//convert string to char array.
		for (char i: input.toCharArray()) {
			//only calculate letters
			if(Character.isLetter(i)==true) {
				//check if key exists, initialize to 1 if not.
			if (lettercount.containsKey(i)==false) {
				lettercount.put(i, 1);
			}else {
				// add 1 to existing value.
				lettercount.put(i, (lettercount.get(i)+1));
			}
			}
		}
		return lettercount;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your sentence:");
		String input = scan.nextLine();
		System.out.println(letterCount(input));

	}

}
