package JavaStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaExpression {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		names.add("Anshul");
		names.add("Atinder");
		names.add("Jain");
		names.add("Singh");
		//
		long co = names.stream().filter(s -> s.startsWith("A")).count();
		System.out.println(co);
		//
		names.stream().sorted().forEach(s->System.out.println(s));
		//
		names.stream().filter(s -> s.length() > 4).map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));
		//
		boolean d=names.stream().anyMatch(s->s.equalsIgnoreCase("Anshul"));
		System.out.println(d);

		//
		List<String> ls=names.stream().filter(s->s.startsWith("A")).map(s->s.toUpperCase()).collect(Collectors.toList());
		
		
		System.out.println(ls.get(0));
		
		// find even number from array and then multiply by 2
		int a[]= {1,2,3,4,5,6,7,8};
		List<Integer> in=Arrays.stream(a).filter(s->s%2==0).map(s->s*2).boxed().collect(Collectors.toList());
		System.out.println(Arrays.toString(in.toArray()));
		
		
	
		
		//
		
	
	}

}
