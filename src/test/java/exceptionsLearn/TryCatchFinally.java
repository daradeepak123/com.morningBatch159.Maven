package exceptionsLearn;

public class TryCatchFinally {

	public static void main(String[] args) {

		try {
			
			System.out.println(10/1);
			
		}
		
		catch(ArithmeticException e)
		{
			System.out.println();
			e.printStackTrace();
		}
		finally {
			System.out.println("This is finally block");
		}
		
		

	}

}
