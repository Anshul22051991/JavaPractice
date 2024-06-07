import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the two numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        
        // Calculate and output the GCD
        System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + gcd(num1, num2));
        
        scanner.close();
    }
    
    // Helper method to calculate the GCD using the Euclidean algorithm
    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

