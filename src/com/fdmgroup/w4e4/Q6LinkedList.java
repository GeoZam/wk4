/*
 * Q6: Write a method that takes in a LinkedList and returns a LinkedList object containing a 
 * copy of the first list, but in reverse order.*/

package com.fdmgroup.w4e4;
import java.util.LinkedList;

public class Q6LinkedList {

	public static LinkedList reverseOrder(LinkedList input) {
		LinkedList output = new LinkedList();
		for(int i=input.size()-1;i>=0;i--) {
			output.add(input.get(i));
		}
		return output;
	}

	public static void main(String[] args) {
		LinkedList input = new LinkedList();
		input.add(1);
		input.add(40);
		input.add(3);
		input.add(19);
		System.out.println("The origional linkedlist is: "+input);
		System.out.println("The reversed linkedlist is: "+reverseOrder(input));

	}

}
