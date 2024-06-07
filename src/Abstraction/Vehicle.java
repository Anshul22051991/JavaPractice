
//*********************************************************************

// 1. Abstract class can't be final or static
//2. Abstract method can't be final or static
//3.Object of abstract class can't be created but reference can be created
//4. All the abstract method of abstract class should be implement in child class

//***************************************************************************



package Abstraction;

 abstract  class Vehicle {

	 abstract void metho1();
	 public void metho2() {
		 System.out.println("Method 1");
	 }
	 abstract void method3();
	 
}
