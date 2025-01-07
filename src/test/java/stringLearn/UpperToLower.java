package stringLearn;

public class UpperToLower {

	public static void main(String[] args) {


		String str="upper To LOWER CaSe";
		
		
		for(int i=0;i<str.length();i++) {
		
		if(Character.isUpperCase(str.charAt(i)))
		{
			System.out.print(Character.toLowerCase(str.charAt(i)));
		}
		else
		{
			System.out.print(Character.toUpperCase(str.charAt(i)));
		}
		}
		
		

	}

}
