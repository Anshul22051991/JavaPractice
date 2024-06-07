
public class MergeStringAlternatively {

	public static void main(String[] args) {
	String s1="ab";
	String s2="pqrs";
	String out=" ";
	for(int i=0;i<s1.length();i++) {
		out=out+s1.charAt(i)+s2.charAt(i);
	}
	System.out.println(out);
	for(int i=2;i<4;i++) {
		out=out+s2.charAt(i);
	}
	System.out.println(out);

	}

}
