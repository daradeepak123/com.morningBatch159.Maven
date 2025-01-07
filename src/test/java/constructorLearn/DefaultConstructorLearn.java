package constructorLearn;

import calculator.LogicCalculator;

public class DefaultConstructorLearn {
	
	int a;
	boolean bool;
	
	DefaultConstructorLearn()
	{
		LogicCalculator l=new LogicCalculator();
		
		a=l.abc;
		bool=true;
	}
	DefaultConstructorLearn(int i)
	{
		a=i;
		bool=true;
		
		
	}
	
	DefaultConstructorLearn(int i,boolean b)
	{
		System.out.println("another");
		a=i;
		bool=b;
	}

	public static void main(String[] args) {
		DefaultConstructorLearn o=new DefaultConstructorLearn(1000);
		
		System.out.println(o.a);
		System.out.println(o.bool);
		
		DefaultConstructorLearn oo=new DefaultConstructorLearn(10000,false);
		System.out.println(oo.a);
		System.out.println(oo.bool);
		
		
		DefaultConstructorLearn o1=new DefaultConstructorLearn();
		System.out.println(o1.a);
		
		
	}

}
