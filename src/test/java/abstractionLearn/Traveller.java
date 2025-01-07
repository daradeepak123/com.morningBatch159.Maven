package abstractionLearn;

import java.util.Scanner;

public class Traveller {

	static Country c;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter desired country");
		String country=sc.next();
		if(country.equals("india"))
		{
			c=new India();
			
		}
		else if(country.equals("US"))
		{
			c=new US();
		}
		else if(country.equals("AUS"))
		{
			c=new AUS();
		}
	
		Country c1=new India();
		Country c2=new US();
		Country c3=new AUS();
		
		c1.currency();
		c2.crimeRate();
		c3.captialCity();

	}

}
