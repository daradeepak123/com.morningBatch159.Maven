package dataTypesVariables;

import encapsule.GetterSetterMethods;

public class TypesOfVariables {
	
	public static int a=100;  //class level variable and global variable
	public int abc=500;
	
	protected static String str="hello";
	
	public static void intData()
	{
		System.out.println(a);
	}
	
	public static void main(String args[])
	{
		GetterSetterMethods o=new GetterSetterMethods();		
		
		
//		System.out.println(a);
//		
//		intData();
	}
	
	// prints                         5  2 times   2   1 time

}
