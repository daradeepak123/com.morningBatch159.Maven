package stringLearn;

public class StringMethodsAll {
	
	
	
	public String reverseString(String s)
	{
		String revData="";
		
		
		for(int i=s.length()-1;i>=0;i--)
		{
			revData=revData+s.charAt(i);
		}
		
		palindromeCheck(s,revData);
		
		return revData;
	}
	
	
	public void palindromeCheck(String s,String ss)
	{
		if(s.equals(ss))
		{
			System.out.println(s+" is a palindrome word");
		}
		else
		{
			System.out.println(s+ " is not a palindrome word");
		}
	}
	
	public boolean duplicateCharCheck(String str)
	{
		char ch=str.charAt(0);
		int fIndex=str.indexOf(ch);
		int lIndex=str.lastIndexOf(ch);
		
		if(fIndex==lIndex)
		{
			return false;
		}
		else
		{
			return true;
		}
		
	
	}
	

}
