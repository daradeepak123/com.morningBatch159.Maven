package stringLearn;

public class CharacterTypeCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Welcome to J@v@ 99 ";
		int num=0;
		int alpha=0;
		int spl=0;
		
		for(int i=0;i<str.length();i++)
		{
			if(Character.isAlphabetic(str.charAt(i)))
			{
				alpha++;
			}
			else if(Character.isDigit(str.charAt(i)))
			{
				num++;
			}
			else
			{
				spl++;
			}
		}
		
		
		System.out.println("alphabets are "+ alpha);
		System.out.println("digits are "+num);
		System.out.println("special characters "+ spl);
		
		int sum=alpha+num+spl;
		
		if(str.length()==sum)
		{
			System.out.println("data matched");
		}
		else
		{
			System.out.println("check your logic");
		}

	}

}
