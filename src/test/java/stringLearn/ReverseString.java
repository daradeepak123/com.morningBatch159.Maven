package stringLearn;

public class ReverseString {

	public static void main(String[] args) {

		String str="welcome to java";
		
		
		String revData="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			revData=revData+str.charAt(i);
			
		}
		System.out.println(revData);
	

	}

}
