
public class MinMaxNumber {

	public static void main(String[] args) {
		int abc[][]= {{2,3,5},{9,1,4},{7,8,6}};
		int min=abc[0][0];
		int max=abc[0][0];
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(abc[i][j]>max) {
					max=abc[i][j];
				}
			}
		}
		System.out.println(max);

	}

}
