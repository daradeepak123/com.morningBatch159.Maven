package conditionsLearn;

import java.util.Scanner;

public class FindOutOddEvenNumber {
	
	static int num;
	
	public static void oddEvenCheck()
	{
		
		if(num%2==0)
		{
			System.out.println("Given number is even number");
		}
		else
		{
			System.out.println("Given number is odd number");
		}
	}
	

	public static void main(String[] args) {


		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the desired number to check odd and even");
		
		num=sc.nextInt();
		
		oddEvenCheck();

	}

}
