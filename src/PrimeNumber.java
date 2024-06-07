import java.io.InputStream;
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
System.out.println("Enter number");
int n=sc.nextInt();

boolean flag=false;

for(int i=2;i<=n/2;i++) {
	if(n%i==0) {
		flag=true;
		break;
	}
}
if(flag) 
	System.out.println("no is not prime");else
		System.out.println("no is prime");
	}
	}

