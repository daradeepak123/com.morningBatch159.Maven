package operatorsLearn;

public class OpExecution {

	public static void main(String[] args) {
		ComparatorOperators o=new ComparatorOperators();
		
		boolean b=o.lessThan();
			System.out.println(b);
			
			
		System.out.println(true & false);
		
		System.out.println(o.lessThan() | o.graterThan());
		
		
	}

}
