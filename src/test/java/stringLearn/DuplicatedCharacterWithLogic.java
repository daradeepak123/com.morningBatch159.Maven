package stringLearn;

public class DuplicatedCharacterWithLogic {

	public static void main(String[] args) {

		String str="hello hello";
		
		char ch=str.charAt(0);
		
		for(int i=1;i<str.length();i++)
		{
			if(ch==str.charAt(i))
			{
				System.out.println(ch+" is a duplicated character");
				break;
			}
		}
		
		
		
		

	}

}
