import java.util.Arrays;

public class Delete {

	   public static void moveZeroes(int[] nums) {
	        int lastNonZeroFoundAt = 0;

	        // Move all the non-zero elements forward
	        for (int i = 0; i < nums.length; i++) {
	            if (nums[i] != 0) {
	                nums[lastNonZeroFoundAt] = nums[i];
	                lastNonZeroFoundAt++;
	            }
	        }

	        // Fill remaining positions with zeroes
	        for (int i = lastNonZeroFoundAt; i < nums.length; i++) {
	            nums[i] = 0;
	        }
	    }

	    public static void main(String[] args) {
	        int[] nums = {0, 1, 0, 3, 12};
	        moveZeroes(nums);
	        
	        // Output the result
	        for (int num : nums) {
	            System.out.print(num + " ");
	        }
	    }

}
