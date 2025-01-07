package arraysLearn;

public class ArraysBasics {

	public static void main(String[] args) {


		int a[]=new int[10];
		
//		a[0]=50;
//		a[1]=30;
//		a[4]=60;
		
		//System.out.println(a[4]);
		
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=(i+1)*2;
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		
		

	}

}
