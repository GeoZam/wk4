package com.fdmgroup.fizzbuzz.task1;

import java.util.Scanner;


public class FizzBuzz {
	
	
	public static String[] Fizzbuzz(int input) {
		String[] result = new String[input];
		for (int i = 1; i<=input; i++) {
			if (i%15==0) {
				result[i-1]="FizzBuzz";
			}else if (i%3==0) {
				result[i-1]="Fizz";
			}else if (i%5==0) {
				result[i-1]="Buzz";
			}
			else {
				result[i-1]=String.valueOf(i);
			}
			System.out.println(result[i-1]);
			
		}
		return result;
		
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		Fizzbuzz(input);
		

	}

}
