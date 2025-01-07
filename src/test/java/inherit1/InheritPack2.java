package inherit1;

public class InheritPack2 extends InheritPack1 {

	
	public void generalMethod()
	{
		System.out.println(a);
		System.out.println(x);
		System.out.println(str);
		hello();
		hi();
		
	}
	
	public void hello()
	{
		System.out.println("this is hello I am saying namaste");
	}
	
	public static void main(String args[])
	{
		InheritPack2 o=new InheritPack2();
//		System.out.println(a);
//		System.out.println(o.x);
		
		o.hello();
//		hi();
//		o.generalMethod();
	}
	
	
	
	
	
}
