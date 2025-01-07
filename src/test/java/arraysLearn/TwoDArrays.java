package arraysLearn;

import java.util.Random;

public class TwoDArrays {

	public static void main(String[] args) {


		int num[][]=new int[50][50];
		Random r=new Random();
		for(int i=0;i<num.length;i++)
		{
			for(int j=0;j<num[1].length;j++)
			{
				num[i][j]=r.nextInt(100);
			}
		}
		
		
		for(int i=0;i<num.length;i++)
		{
			for(int j=0;j<num[1].length;j++)
			{
				System.out.print(num[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		
		
		
		

	}

}
