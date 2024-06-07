import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class CountOccurenceOfCharString {

	public static void main(String[] args) {
		String s="anshuljainatindersingh";
		char[] cc=s.toCharArray();
		
		ArrayList<Character> ar= new ArrayList<Character>();
		
		for(int i=0;i<cc.length;i++) {
			int k=0;
			if(!ar.contains(cc[i])) {
				ar.add(cc[i]);
				k++;
				for(int j=i+1;j<cc.length;j++) {
					if(cc[i]==cc[j]) {
						k++;
						
					}
				}
				if (k>1)
				System.out.println(cc[i]+" is repeated "+k+" times");
			}
			
			
		}
		
		
	
	}

}
