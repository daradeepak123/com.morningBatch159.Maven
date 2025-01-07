package stringLearn;

import java.util.Scanner;

public class PalindromeCheck {

	public static void main(String[] args) {

		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter desired string");
		String str=sc.next();
		
		StringMethodsAll s=new StringMethodsAll();
		s.reverseString(str);
		
		//System.out.println(reverseData);
		
		
		
		

	}

}
