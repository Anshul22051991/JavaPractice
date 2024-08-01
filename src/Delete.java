import java.util.ArrayList;
import java.util.Arrays;

public class Delete {

	public static void main(String[] args) {
		Delete d= new Delete();
		String p=d.par("Ans", 10);
		System.out.println(p);
		
	}
	public String par(String s, int len) {
	
		if(s==null)
			s="";
		if(s.length()>len)
			throw new RuntimeException("The data field is more than the given lenth");
		else if(s.length()==len)
			return s;
		else {
			for(int i=s.length();i<len;i++)
				s=s+" ";
			return s;
		}
		
}


}