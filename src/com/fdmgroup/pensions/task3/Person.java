package com.fdmgroup.pensions.task3;

public class Person {
	private String firstname;
	private String lastname;
	private String dateOfBirth;
	
	//a constructor
	public Person(String firstname, String lastname, String dateOfBirth) {
		this.firstname=firstname;
		this.lastname=lastname;
		this.dateOfBirth=dateOfBirth;
		
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	
	
}
