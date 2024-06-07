//********************************************
//1. throw keyword is used to explicitly throw the exception 
//2. throws keyword is used in method signature to indicate that the method can throw exception
//and it might not handle it so it's calling method need to handle the exception.
//3. finally block is execution whether exception is handled or not, this will always execute
//******************************************


package Exeption;

public class ManualException {
	
	public static class NegativeDimensionException extends Exception{
		public String toString() {
			return "Dimension can't be negative";
		}
		
	}

	static int area(int l, int b) throws NegativeDimensionException {
		if(l<0||b<0) 
			
		throw new NegativeDimensionException();
		return l*b;
		
	}
	static void meth1()throws NegativeDimensionException {
		System.out.println("Area is "+ area(-10,5));
		
	}

	public static void main(String[] args) {
		try{
			meth1();
		}
		catch(NegativeDimensionException e) {
			System.out.println(e);
			
		}
		

	}

}
