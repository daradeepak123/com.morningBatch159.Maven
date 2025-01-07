package conditionsLearn;

import java.util.Scanner;

public class ElectricityBilling {
	
	public static int a=0;
	
	public static void generateEleBilling(int lMonth,int cMonth,String name,String area)
	{
		
		int units=cMonth-lMonth; 
		int amount=0;
		
		
		if(area.equalsIgnoreCase("rural")) {
		if(units<100)
		{
			amount=units*2;
		}
		else if(units>=100 & units<250)
		{
			amount=units*4;
		}
		else if(units>=250 & units<500)
		{
			amount=units*6;
		}
		else if(units>=500 & units<750)
		{
			amount=units*10;
		}
		else if(units>=750 )
		{
			amount=units*15;
		}
		}
		else if(area.equalsIgnoreCase("town"))
		{
			if(units<100)
			{
				amount=units*3;
			}
			else if(units>=100 & units<250)
			{
				amount=units*5;
			}
			else if(units>=250 & units<500)
			{
				amount=units*7;
			}
			else if(units>=500 & units<750)
			{
				amount=units*11;
			}
			else if(units>=750 )
			{
				amount=units*16;
			}
		}
		
		System.out.println("hello "+name+", you need to pay: "+amount+150);
	}
	
	

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your name");
		String name=sc.next();
		System.out.println("enter your lastmonth reading");
		int lMonth=sc.nextInt();
		System.out.println("enter your current month reading");
		int cMonth=sc.nextInt();
		System.out.println("enter type of area rural/town/city");
		String area=sc.next();
		
		generateEleBilling(lMonth,cMonth,name,area);
	}

}
