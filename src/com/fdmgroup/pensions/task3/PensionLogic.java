package com.fdmgroup.pensions.task3;

public class PensionLogic {
	public static boolean isPensionable(Person person, String year) {
		
		int birthyear=Integer.parseInt(person.getDateOfBirth().substring(6));
		
		if (Integer.parseInt(year)-birthyear>=65) {
		return true;
	}else {
		return false;
	}

}
}
