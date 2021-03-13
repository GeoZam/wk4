package com.fdmgroup.pensions.task3;

public class Person {
	private String firstname;
	private String lastname;
	private String dateOfBirth;
	public Person(String firstname, String lastname, String dateOfBirth) {
		this.firstname=firstname;
		this.lastname=lastname;
		this.dateOfBirth=dateOfBirth;
	}
	
	public void setFirstName(String firstname) {
		this.firstname=firstname;
	}
	public void setLastName(String lastname) {
		this.lastname=lastname;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth=dateOfBirth;
	}
	public String getFirstName() {
		return firstname;
	}
	public String getLastName() {
		return lastname;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	
	
}
