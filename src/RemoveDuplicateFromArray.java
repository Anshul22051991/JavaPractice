import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicateFromArray {

	public static void main(String[] args) {
	
	        int[] a = {1, 2, 2, 3, 4, 4, 5, 6, 6};

	       

	        // Sort the array
	        Arrays.sort(a);

	        // Use a temporary array to store unique elements
	        int[] temp = new int[a.length];
	        int j = 0;

	        // Iterate through the sorted array
	        for (int i = 0; i < a.length - 1; i++) {
	            if (a[i] != a[i + 1]) {
	                temp[j++] = a[i];
	            }
	        }

	        // Add the last element (which is always unique in sorted array)
	        temp[j++] = a[a.length - 1];
int c[]=new int[j];

for(int i=0;i<c.length;i++) {
	c[i]=temp[i];
}

System.out.println(Arrays.toString(c));
	
	    }
	

}
