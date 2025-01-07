package loops;

public class MultiplicationTable {
	
	static MultiplicationTable o=new MultiplicationTable();
	
	public void mulTable(int num)
	{
		int till=10;
		
		for(int i=1;i<=till;i++)
		{
			
			System.out.println(num+"*"+i+"="+num*i);
		}
	}
	

	public static void main(String[] args) {

		
		int num=9;
		
		o.mulTable(num);
		
		
		
		
		

	}

}
