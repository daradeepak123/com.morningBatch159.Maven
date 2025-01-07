package stringLearn;

public class StringMethods {

	public static void main(String[] args) {


		String str="Welcome Wto e";
		String str1=new String("Welcome to Java!");
		
		char c=str.charAt(0);				
		System.out.println(str.charAt(10));
		System.out.println(str.codePointAt(2));
		System.out.println(str.codePointBefore(3));
		System.out.println(str.compareToIgnoreCase(str1));
		System.out.println(str.concat(str1));
		System.out.println(str.contains("welc "));
		System.out.println(str.contentEquals(str));
		System.out.println(str.endsWith(" "));
		System.out.println(str.equals("Welcome to "));
		System.out.println(str.equalsIgnoreCase("welcome TO "));
		String s=str.indent(2);
		System.out.println(s);
		System.out.println(str.indexOf('e'));
		System.out.println(str.lastIndexOf('e'));
		System.out.println(str.indexOf("e"));
		System.out.println(str.indexOf('e', 3, 8));
		System.out.println(str.intern());
		String ss=" ";
		System.out.println(ss.isBlank());
		System.out.println(ss.isEmpty());
		System.out.println(str.length());
		System.out.println(str.repeat(4));
		System.out.println(str.replace('W', 'a'));
		System.out.println(str.replaceFirst("Wel", "wel"));
		System.out.println(str.startsWith("W"));
		System.out.println(str.strip());
		System.out.println(str.substring(3));
		System.out.println(str.toLowerCase());


		
		
		
		
		
		
		
		
		

	}

}
