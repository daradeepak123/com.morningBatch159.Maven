package objectLearn;

public class ObjectLearn1 {
	
	public static int abc=500;
	byte b=50;
	String s="new String";
	boolean bool=true;
	static char ch='@';	
	static String str="Java programing";
	
	public static void learnObj1()
	{
		System.out.println("this is static method ");
	}
	
	public void learnObjNonStatic1()
	{
		System.out.println("this is static method ");
	}
	
	

	public static void main(String[] args) {
		ObjectLearn1 o=new ObjectLearn1();
				System.out.println(o.b);
				System.out.println(ObjectLearn1.abc);
				
		System.out.println(abc);

	}

}
