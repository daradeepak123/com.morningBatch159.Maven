package staticNonStatic;

public class StaticNonStaticLEarn {
	
	static int a=100;
	int xyz=1000;
	public static void main(String[] args) {
		a=1000;
		System.out.println(a);
		hi();
		
		StaticNonStaticLEarn obj=new StaticNonStaticLEarn();
		System.out.println(obj.xyz);
		obj.hello();	
		
		System.out.println(a);		
		
	}
	
	public static void hi()
	{
		System.out.println(a);
		
	}
	
	public void hello()
	{
		
		System.out.println(a);
		System.out.println(xyz);
	}
	

}
