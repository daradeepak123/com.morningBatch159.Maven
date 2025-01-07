package loops;

public class OddEvenCount {

	public static void main(String[] args) {
		
		int evenCount=0;
		int oddCount=0;
		
		for(int i=1;i<=1000;i++)
		{
			if(i%2==0)
			{
				evenCount++;
				System.out.println("this is even number "+i);
			}
			else
			{
				oddCount++;
				System.out.println("this is odd number "+i);
			}
		}
		
		System.out.println("we have "+evenCount+" even numbers and"+" we have "+oddCount+" odd numbers" );
		
		

	}

}
