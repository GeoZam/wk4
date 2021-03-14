package com.fdmgroup.w4e3;


//7. Any class that implements an interface must provide method bodies for each method in the interface, 
//   unless it is an abstract class.
//8. Assume interface B extends interface A.  Demonstrate that a class that implements B must provide 
//   method bodies for methods in both A and B. 
//12. Methods can be inherited.
//13. Member variables can be overridden.
//14. A sub-class constructor can call its super-class constructor using the super keyword. 


public class Class2 extends Class1 implements Interface1{

	@Override
	public void method1() {} //Q7: must implement all methods in the interface

	@Override
	public void method2() {} //Q8: must implement all methods from the interface when it extends another interface.
	
	@Override
	public void method3() {}; //Q12: methods can be inherited; 

	public int method5() {   //Q13: Member variables can be overridden.
		return super.var2;
	}
	
	public Class2(String s1) {        //Q14: A sub-class constructor can call its super-class constructor using the super keyword. 
		super(s1);
	}
	
}
	
	
	
	



