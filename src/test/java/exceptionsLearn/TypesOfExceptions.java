package exceptionsLearn;

public class TypesOfExceptions {

	public static void main(String[] args)  {

		int a=100;
		int b=1;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		
		try {
		System.out.println(a/b);
		
		String str="hello";
		System.out.println(str.length());
		int aa[]=new int[1];
		aa[0]=10;
		aa[1]=50;
		
		
		}catch(NullPointerException e)
		{
			System.out.println("this is null pointer");
			e.printStackTrace();
		}
		catch(ArithmeticException e)
		{
			System.out.println("this is arithmetic exception");
			e.printStackTrace();
		}
		catch(Exception e)
		{
			System.out.println("this is exception block");
			e.printStackTrace();
		}
		
		System.out.println(a+b);


	}

}
