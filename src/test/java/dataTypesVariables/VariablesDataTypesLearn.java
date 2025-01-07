package dataTypesVariables;

public class VariablesDataTypesLearn {
	static int cc=1000;
	int xy=500;
	public static void hello()
	{
		int xyz=100;
		System.out.println(xyz);
	}
	
	public static void main(String[] args)
	{
		hello();
		
		byte b=100;
		
		System.out.println(b+20);
		//b=30;
		System.out.println(b);
		
		short s=500;
		System.out.println(s+b);
		// 600 620
		
		int i=1000;
		i=s+b+400;
		System.out.println(i);
		
		i=s;
		System.out.println(i);
		
		
		long ln=9999999999l;
		System.out.println(ln);
		
		
		
		float fl=10.234234f;
		System.out.println(fl);
		double d=500;
		System.out.println(d);
		
		
		boolean bool=false;
		System.out.println(bool);
		
		char ch='@';
		System.out.println(ch);
		
		String str="Hello all welcome to Qu@lithought  for 2 'nd time";
		
		System.out.println(str);
	}
	
	
	

}
