package com.fdmgroup.pensions.task3;

public class PensionLogic {
	public static boolean isPensionable(Person person, String year) {
		
		//change string into int, and cut the first 6 letters.
		int birthyear=Integer.parseInt(person.getDateOfBirth().substring(6));
		
		//need to change string year into int.
		if (Integer.parseInt(year)-birthyear>=65) {
		return true;
	}else {
		return false;
	}

}
}
