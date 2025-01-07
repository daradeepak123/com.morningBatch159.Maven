package arraysLearn;

public class ArraysAsParameter {
	
	
	public static void printStringArray(String data[])
	{
		for(String str:data)
		{
			System.out.println(str);
		}
	}
	
	public static String[] updateData(String data[])
	{
		
		for(int i=0;i<data.length;i++)
		{
			data[i]="QT "+data[i];
		}
		
		
		
		return data;
	}
	
	

	public static void main(String[] args) {

		String names[]=new String[3];
		
		names[0]="Hello";
		names[1]="Welcome";
		names[2]="Java";
		
		printStringArray(names);
		
		
		names=updateData(names);
		for(String s:names)
		{
			System.out.println(s);
		}

	}

}
