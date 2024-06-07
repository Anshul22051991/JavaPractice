
public class StartPattern5 {

	public static void main(String[] args) {
		int rows = 5; // You can change the number of rows as per your requirement

        // Loop through each row
        for (int i = 1; i <= rows; i++) {
            // Print spaces for each row to align the triangle to the right
            for (int j = rows - i; j > 0; j--) {
                System.out.print(" ");
            }
            // Print asterisks for each row
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print("*");
            }
            // Move to the next line after printing each row
            System.out.println();
        }
    }

	}

