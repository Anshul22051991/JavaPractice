
public class Static {
	 String name="ssff";
	static int age=20;
	static final int b=30;
	int a=30;
	
	
//	public Delete(String n,int a) {
//		name=n;
//		age=a;
//		System.out.println(name);
//		System.out.println(age);
//		
//	}


	public static void main(String[] args) {
		Static d1= new Static();
		Static d2=new Static();
		d1.age=20;
	
		System.out.println(d2.age);
		d1.a=89;
		System.out.println(d2.a);
		
		
		
	
	}

}
