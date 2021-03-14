/*
 * Q8. Create a method that takes in a variable argument of type double and returns a 
 * PriorityQueue that orders the doubles in descending order (i.e., 14.8 should be the 
 * highest-priority element rather than 2.2)
 */

package com.fdmgroup.w4e4;
import java.util.PriorityQueue;

public class Q8PriorityQueue {
	
	public static PriorityQueue order(double[] input) {
		PriorityQueue output = new PriorityQueue();
		for (double i: input) {
			output.add(i);
		}
		return output;
	}

	public static void main(String[] args) {
		double [] input= {9.4,2.0,3.6,1.0};
		System.out.println(order(input));

	}

}
