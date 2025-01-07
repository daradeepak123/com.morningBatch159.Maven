package stringLearn;

public class DuplicatingCharacter {

	public static void main(String[] args) {

		String str="welcome to quality thought welcome students";
		
		String w[]=str.split(" ");
		for(String word:w) {	
				
		StringMethodsAll o=new StringMethodsAll();
		
		if(o.duplicateCharCheck(word))
		{
			System.out.println(word.charAt(0)+" is a duplicated character");
		}
		else
		{
			System.out.println(word.charAt(0)+" is not a duplicated character");
		}
		}

	}

}
