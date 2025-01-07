package arraysLearn;

import java.util.Scanner;

public class OddArrayEvenArray {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter from range number");
		int fromRange=sc.nextInt();
		System.out.println("enter to range number");
		int toRange=sc.nextInt();
		int range=(toRange-fromRange)+1;
		
		int num[]=new int[range];
		
		
		for(int i=0;i<num.length;i++)
		{
			num[i]=fromRange++;
		}
		
		int even=0;
		int odd=0;
		
		for(int n:num)
		{
			if(n%2==0)
			{
				even++;
			}
			else
			{
				odd++;
			}
			
		}
		System.out.println(even +"          "+odd);
		
		int evenArr[]=new int[even];
		int oddArr[]=new int[odd];
		int eCount=0;
		int oCount=0;
		for(int i=0;i<num.length;i++)
		{
			
			if(num[i]%2==0)
			{
				evenArr[eCount++]=num[i];
			}
			else
			{
				oddArr[oCount++]=num[i];
			}
			
		}
	
		for(int eNum:evenArr)
		{
			System.out.println("this is even number "+eNum);
		}
		for(int eNum:oddArr)
		{
			System.out.println("this is odd number "+eNum);
		}
		
		
		
		
		

	}

}
