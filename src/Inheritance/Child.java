
//***************************************************

//1. When child class object is created , parent class constructor is called first
//2. super keyword is used to call the parent class constructor
//3. When reference of parent class is created , overwritten method of child class is called
//4. When reference of parent class is created , extra method of child class can't be accessed
//5. final and static methods can't be overwritten
//6. method overloading achieve compile time polymorphism
//7. method overwritten achieve run time polymorphism

//***************************************************

package Inheritance;

public class Child extends Parent {
	int i=20;
	
	Child(){
	
		
		System.out.println("I am child class constructor");
	}
	Child(String s){
		super(s);
		
		System.out.println("I am child class parametrized constructor");
	}
	public void method1() {
		System.out.println("I am child class method 1");
	}
	
	public void method1(int a) {
		System.out.println("I am child class method 1");
	}
	public void method2() {
		System.out.println("Im am child class method 2");
		System.out.println(super.i);
	}

	public static void main(String[] args) {
		Child c= new Child(" boom");
		Child c1= new Child();
		Parent p= new Child();
		c.method1();
		System.out.println("***********************");
		p.method1();
		c.method2();
	

	}

}
