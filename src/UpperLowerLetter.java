
public class UpperLowerLetter {

	public static void main(String[] args) {
		String s="AnShUl jaIN";
		int upper=0;
		int lower=0;
		
		for(int i=0;i<s.length();i++) {
			char ch= s.charAt(i);
			if(ch>='A'&& ch<='Z') {
				System.out.println(ch+" is in upper case");
				upper ++;
			}
			else if(ch>='a' && ch<='z') {
				System.out.println(ch+" is in lower case");
				lower++;
			}
		}
		
		System.out.println("Count of upper case character is "+upper);
		System.out.println("Count of lower case character is "+lower);
		
		
	}

}
