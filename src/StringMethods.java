
public class StringMethods {
	public static void main(String args[]) {
		String s1="Pattern";
		String s2="Pattern";
		String s3= new String("Pattern");
		String s4= "Star in shines in the sky";
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
		
		System.out.println(s1.compareTo(s2));
		System.out.println(s4.concat(s1));
		System.out.println(s4.lastIndexOf("shines"));
		System.out.println(s4.indexOf("s", 2));
		System.out.println(s4.lastIndexOf("in",11));
		System.out.println(s4.substring(8,12));
	String[]a= s4.split("in");
	for(String s:a) {
		System.out.println(s.trim());
	}
	
	}

}
