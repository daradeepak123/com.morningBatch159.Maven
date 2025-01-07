package calculator;

import dataTypesVariables.TypesOfVariables;

public class ExecutionClass {

	public static void main(String[] args) {
		LogicCalculator o=new LogicCalculator();
		DataMantain data=new DataMantain(10, 10);
		
		o.add(500, -250);
		LogicCalculator.sub(data.a, data.b);
		System.out.println(TypesOfVariables.a);
		TypesOfVariables oo=new TypesOfVariables();
		System.out.println(oo.abc);
		

	}

}
