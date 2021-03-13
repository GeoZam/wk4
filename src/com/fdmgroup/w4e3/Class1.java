package com.fdmgroup.w4e3;

//1. abstract class can contain both abstract and non-abstract methods.
//2. An abstract class can have member variables.
//3. An abstract class can implement an interface.
//4. An abstract class can have a constructor.
//5. All variables in an interface are implicitly final, even if the final modifier is not used.
//6. An interface can extend another interface.
interface Interface1{
	public int var2=0;              //Q5: variables in Interfaces are final.
	
}

interface Interface2 extends Interface1{ //Q6:An interface can extend another interface.
	
}
public abstract class Class1 implements Interface1{ //Q3:Implement an interface.
	public abstract void method1(); //Q1: abstract method
	public void method2() {};       //Q1: non-abstract method
	public int var1;                //Q2: member variables
	public Class1() {               //Q4: constructor
		this.var1 = var1;
	}
	

}
