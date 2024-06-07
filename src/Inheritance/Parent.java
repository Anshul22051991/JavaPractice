package Inheritance;

public class Parent {
	int i=10;
	 Parent(){
		System.out.println("I am parent class constructore");
	}
	Parent(String s){
		System.out.println("I am parent class parametrized constructor"+s);
	}
	public void method1() {
		System.out.println("I am parent class method 1");
	}

}
