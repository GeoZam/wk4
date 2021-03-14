package com.fdmgroup.w4e3;

//1. abstract class can contain both abstract and non-abstract methods.
//2. An abstract class can have member variables.
//3. An abstract class can implement an interface.
//4. An abstract class can have a constructor.
//5. All variables in an interface are implicitly final, even if the final modifier is not used.
//6. An interface can extend another interface.
//10. Constructors can be overloaded
//11. Methods can be overloaded.


interface Interface1 extends Interface2{ //Q6: extend another interface
	public int var1=0;                   //Q5: variables in Interfaces are final.
	public void method1();               
	
}

interface Interface2{                    //Q6:An interface can extend another interface.
	public void method2();          
	
}
public abstract class Class1 implements Interface1{ //Q3:Implement an interface.
	public abstract void method3(); 				//Q1: abstract method
	public void method4() {};       				//Q1: non-abstract method
	public int var2;                				//Q2: member variables
	public int var3;
	public Class1() {               				//Q4: constructor
		this.var2 = var2;
	}
	public Class1(String s1) {      				//Q10: constructors can be overloaded
		
	}
	public void method3(String s1){} 				//Q11: Methods can be overloaded.
	

}

