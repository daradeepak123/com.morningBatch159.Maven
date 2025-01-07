package loops;

public class LoopCount {

	public static void main(String[] args) {
	
		
		int count=0;
		int iCount=0;
		int iiCount=0;
		
		for(int i=1;i<=10;i++)
		{
			count++;
			
			for(int j=1;j<=10;j++)
			{
				iCount++;
				for(int k=1;k<=10;k++)
				{
					iiCount++;
				}
				
				
			}
			
			
		}
		System.out.println(count);
		
		System.out.println(iCount);
		
		System.out.println(iiCount);
		

	}

}
