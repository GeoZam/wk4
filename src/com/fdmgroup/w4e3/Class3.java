package com.fdmgroup.w4e3;


//9: Every class must have a constructor, even if it is the default constructor that the 
//compiler adds.  Demonstrate making an instance of a class by using the compiler-generated 
//no-arg constructor.
//15.[Wrong!] Any concrete class with an abstract class in its hierarchy must implement all abstract methods 
//from the superclass. Abstract only restricts its first extension, but not extension of extension!!

public class Class3{

	//Q15: we don't need to implement method3 here! if we add extend Class2 (But will conflict with Q9)

	//Q9 instance of a class by using the compiler-generated no-arg constructor
	public static void main(String[] args) {
		Class3 class3 = new Class3(); 
	}

}
