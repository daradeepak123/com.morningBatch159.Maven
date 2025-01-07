package conditionsLearn;

import java.util.Scanner;

public class FindPassFailForAll {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter math marks ");
		int math=sc.nextInt();
		

		System.out.println("Enter soc marks ");
		int soc=sc.nextInt();
		

		System.out.println("Enter phy marks ");
		int phy=sc.nextInt();
		
		boolean status=true;
		
		if(math<35)
		{
			status=false;
			System.out.println("You are failed in math and your score is: "+math);
		}
		
		else
		{
			System.out.println("you are passed in math and your score in math is: "+math);
		}
		
		if(soc<=35)
		{
			status=false;
			System.out.println("You are failed in soc and your score is: "+soc);
		}
		
		else
		{
			System.out.println("you are passed in soc and your score in soc is: "+soc);
		}
		
		if(phy<35)
		{
			status=false;
			System.out.println("You are failed in phy and your score is: "+phy);
		}
		
		else
		{
			System.out.println("you are passed in phy and your score in phy is: "+phy);
		}
		
		
		int totalMarks=math+phy+soc;
		if(totalMarks<105)
		{
			status=false;
			System.out.println("considering your overall score you are failed and score is: "+totalMarks);
		}
		else
		{
			System.out.println("you got total socre is: "+totalMarks);
		}
		
		if(status)
		{
			System.out.println("Passed in all subjects");
		}
		else
		{
			System.out.println("failed in any one of subject/all subjects");
		}
		
	}

}
