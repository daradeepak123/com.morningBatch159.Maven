package stringLearn;

public class FIndPalindromeSentance {

	public static void main(String[] args) {


		String str="mom and dad are going to meet madam";
		
		String words[]=str.split(" ");
		
		
		for(String s:words)
		{
			StringMethodsAll ss=new StringMethodsAll();
			ss.reverseString(s);
		}
		

	}

}
