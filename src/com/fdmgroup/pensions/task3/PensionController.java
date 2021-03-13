package com.fdmgroup.pensions.task3;

public class PensionController {
	public void handlePensions(Person[] people) {
		PensionLogic pensionLogic = new PensionLogic();
		View view = new View();
		
		for (int i=0; i<people.length;i++) {
			if (pensionLogic.isPensionable(people[i], "2014")) {
				view.printEligible(people[i]);
			}
			else {
				view.printIneligible(people[i]);
			}
			
		}
	}

}
