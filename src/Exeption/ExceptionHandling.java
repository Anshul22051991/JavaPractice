//*******************************************************************
//1. Parent class for all the exceptions is Exception
//2. Exceptions can be handled with try catch block
//3. Exception terminates the execution of the remaning program
//4. There are two types of exception checked and unchecked excpetion
// Checked Exception occurs during compile time and unchecked exception occurs during run time
//5. User can define it's own exception by creating a new class and extending exception class and overwriting toStirng method
//of exception class
//
//*******************************************************************
package Exeption;

public class ExceptionHandling {

	public static void main(String[] args) {
		int a[]= {1,4,8,3,0,8};
		try {
		int c=a[2]/a[1];
		
		System.out.println("Result is "+c);
		
		int d=a[6];
		System.out.println("we");
		System.out.println(d);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println(e);
		}
		System.out.println("bye");

	}
//	public class ManualException{
//		public String toString() {
//			return "Manual Exception";
//			
//		}
	}


