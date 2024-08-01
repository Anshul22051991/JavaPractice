package Abstraction;

public class Car extends Vehicle {
	
	public void metho1() {
		
	}

	void method3(String s) {
		System.out.println("string print");
		
	}

	void method4() {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		Vehicle v= new Car();
		Car c= new Car();
		c.method3();
		

	}



	
}
