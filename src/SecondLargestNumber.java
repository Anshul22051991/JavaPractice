
public class SecondLargestNumber {

	public static void main(String[] args) {
		
		
		int a[]= {5,8,10,56,10,67,34,7,90,110};
		int max1=a[0];
		int max2=a[0];
		
		for(int i=0;i<a.length;i++) {
			
		if(a[i]>max1) {
			max2=max1;
			max1=a[i];
		
			
			}
		
			else if(a[i]>max2) {
				max2=a[i];
				
				
		}
			
		}
		System.out.println(max2);

	}

}
