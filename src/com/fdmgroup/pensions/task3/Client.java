package com.fdmgroup.pensions.task3;

public class Client {

	public static void main(String[] args) {
		Person person1 = new Person("John","Smith","28/06/1993");
		Person person2 = new Person("Jane","Doe","05/01/1950");
		Person person3 = new Person("Fred","Bloggs","12/12/1949");
		Person[] people = {person1, person2, person3};
		
		PensionController pensioncontroller = new PensionController();
		pensioncontroller.handlePensions(people);
	}

}
