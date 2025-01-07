package collectionsLearn;

import java.util.*;

public class ConvertStringToCharacter {

	public static void main(String[] args) {

		String str="Quality Thought";
		
		str=str.toLowerCase();
//		List<Character> listChars=new ArrayList<Character>();
		
//		for(int i=0;i<str.length();i++)
//		{
//			listChars.add(Character.toLowerCase(str.charAt(i)));	
//		}
		
		
//		for(char c:listChars)
//		{
//			System.out.println(c);
//		}
		
		Set<Character> setChars=new HashSet<Character>();
		
		for(int i=0;i<str.length();i++)
		{
			setChars.add(Character.toLowerCase(str.charAt(i)));	
		}
		for(char c:setChars)
		{
			System.out.println(c);
		}
		
		int count=0;
		for(char c:setChars)  //t
		{
			count=0;
			for(int i=0;i<str.length();i++)
			{
				if(c==str.charAt(i))
				{
				count++;
				}
			
			}
		if(count>1)
		System.out.println("occurance of char "+c+" is "+ count);
		}
		
		

	}

}
