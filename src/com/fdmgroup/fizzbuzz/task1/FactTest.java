package com.fdmgroup.fizzbuzz.task1;

import static org.junit.Assert.*;

import org.junit.Test;


public class FactTest {

	@Test
	public void test() {
		String[] result = {"1","2","Fizz"};
		assertEquals(result, new FizzBuzz().Fizzbuzz(3));
		
	}
	@Test
	public void test2() {
		String[] result2 = {"1","2","Fizz","4"};
		assertEquals(result2, new FizzBuzz().Fizzbuzz(4));
	}

}
