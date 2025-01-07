package staticNonStatic;

public class DataAndUsage {
	
	
	int a=100;    // instance variable
	static int ab=1000;   // global variable
	
	public void hi()
	{
		int abcd=5000;    // local variable
		System.out.println(abcd);
		hello();
		ab=1005;
		System.out.println(a);
		System.out.println(ab);
		
	}
	public static void hello()
	{
		System.out.println(ab);
		System.out.println("this is hello method");
	}

	public static void main(String[] args) {
		DataAndUsage obj=new DataAndUsage();
		obj.hi();
		System.out.println(ab);		
	}

}
