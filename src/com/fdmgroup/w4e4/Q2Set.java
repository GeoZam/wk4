//Q2: Write a method that reads in a series of first names and eliminates duplicates by 
//    storing them in a Set. It should return the Set.
// I will go with HashSet.

package com.fdmgroup.w4e4;

import java.util.HashSet;

public class Q2Set {

	public static HashSet addnames(String[] firstname) {
		HashSet set = new HashSet();
		for (int i = 0; i < firstname.length; i++) {
			set.add(firstname[i]);
		}
		return set;
	}

	public static void main(String[] args) {
		String[] firstname = { "Julia", "Tim", "Julia" };
		System.out.println(addnames(firstname));
	}
}
