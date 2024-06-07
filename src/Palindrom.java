import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter number");
	int n=scan.nextInt();
	
	int m=n;
	int rev=0,r;
	
	while(n>0) {
		r=n%10;
		rev=rev*10+r;
		n/=10;
			
	}
	System.out.println(rev);
	if(rev==m)
		System.out.println("Numer is palindrom");
	else
		System.out.println("Number not palindrom");
	

	}

}
