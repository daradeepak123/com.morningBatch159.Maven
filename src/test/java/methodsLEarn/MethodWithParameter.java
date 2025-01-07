package methodsLEarn;

public class MethodWithParameter {
	
	public static int addNumbers(int a,int b)
	{
		return a+b;
	}

	public static boolean oddEven(int a)
	{
		
		boolean b=false;
		if(a%2==0)
		{
		b=true;
		}
		return b;
	}

	
	
	
	public static void main(String[] args) {
		int l=addNumbers(11,2);

		boolean bool=oddEven(l);
		System.out.println(bool);
		
		
	}
}
