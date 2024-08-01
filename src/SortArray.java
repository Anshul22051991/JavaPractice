import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class SortArray {
	public static void main(String args[]) {
		int a[]= {2,6,3,5,9,0,8,1};
		int temp=0;
		
		
		for(int i=0;i<8;i++) {
			for(int j=i+1;j<8;j++) {
				if(a[j]>a[i]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
			
				
			}
		
		System.out.println(Arrays.toString(a));
		}
		
	}
	
	


