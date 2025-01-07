package loops;

import java.util.Scanner;

public class ElectricityBillingWithWhile {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter last month reading");
		int lMonth=sc.nextInt();   //100
		
		int cMonth=0;  
		
		do
		{
			System.out.println("enter current month reading should be greater than last month");
			cMonth=sc.nextInt(); 
			
		}while(cMonth<lMonth);
		
		
		
		int units =cMonth-lMonth;
		System.out.println(units);
		
		

	}

}
