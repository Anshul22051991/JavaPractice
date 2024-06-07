
public class ExtractWordFromString {

	public static void main(String[] args) {
		String s="Hello anshul jain ";
		String w="";
			for(int i=0;i<s.length();i++) {
				char ch= s.charAt(i);
				if(s.charAt(i)!=' ') {
					w=w+ch;
				}
				else {
					System.out.println(w);
					w="";
				}
			}
		}

	}

