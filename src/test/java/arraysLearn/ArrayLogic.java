package arraysLearn;

import java.util.Random;

public class ArrayLogic {
	
	
	public String[] stringData(String arr[])
	{
		Random rand=new Random();
		for(int i=0;i<arr.length;i++)
		{
			arr[i]="hello"+rand.nextInt(100);
		}
		return arr;		
	}
	
	public void retriveData(String a[])
	{
		for(String ss:a)
		{
			System.out.println(ss);
		}
	}
	
	

}
