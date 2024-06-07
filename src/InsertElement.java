import java.util.Arrays;

public class InsertElement {

	public static void main(String[] args) {
		int a[]=new int[10];
		a[0]=11;a[1]=2;a[2]=15;a[3]=6;a[4]=9;a[5]=11;
		int x=70;
		int n=6;
		int index=2;
		for(int i=n;i>index;i--) {
			a[i]=a[i-1];
			
		}
		a[index]=x;
		System.out.println(Arrays.toString(a));
		

	}


}
