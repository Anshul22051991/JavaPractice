import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter first number");
		
		int a= scan.nextInt();
		System.out.println("Enter second number");
		int b= scan.nextInt();
		System.out.println("Enter option");
		
		String option=scan.next();
		switch(option){
		case "ADD": 
			System.out.println("Sum is "+(a+b));
			break;
		case "DIV":
			System.out.println("DEvision is "+(a/b));
			break;
			
		 default:
			 System.out.println("sdd");
			
			
		}

	}

}
