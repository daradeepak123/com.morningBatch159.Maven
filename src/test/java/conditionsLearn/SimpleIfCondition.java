package conditionsLearn;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SimpleIfCondition {
	
	
	public static String str()
	{
		return "this is terurn";
	}
	

	public static void main(String[] args) throws FileNotFoundException {

		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter marks obtained ");
		
		int marks=sc.nextInt();
		
		if(marks>500)
		{
			System.out.println("get bicycle");
			
		}
		else
		{
			System.out.println("you got less than 500 so no bi-cycle");
		}
		
		
		
		
		
		
		
		
		

	}

}
