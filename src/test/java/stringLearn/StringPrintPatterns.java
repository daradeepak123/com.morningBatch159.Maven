package stringLearn;

public class StringPrintPatterns {

	public static void main(String[] args) {

		String str="welcome to java";
		System.out.println(str);
		
		
//	for(int i=0;i<str.length();i++)
//	{
//		System.out.println(str.charAt(i));
//	}
		
		char c[]=str.toCharArray();
		
		for(char cc:c)
		{
			System.out.println(cc);
		}
		
		
		for(int i=str.length()-1;i>=0;i--)
		{
			System.out.print(str.charAt(i));
		}
		
		

	}

}
