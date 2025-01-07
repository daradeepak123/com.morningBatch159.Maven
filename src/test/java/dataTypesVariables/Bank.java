package dataTypesVariables;

public class Bank {
	
	
	public String name="QT";
	public String address="Ameerpet";
	String aadharNum="12345678";
	public String phNO="9999999999";
	private int bankBalance=10000;
	
	
	public void withDraw(int amt)
	{
		if(amt<bankBalance)
		{
			bankBalance=bankBalance-amt;
			System.out.println("your current balance is "+bankBalance);
		}
		else
		{
			System.out.println("your current balance is "+bankBalance+" enter lessthan these emount");
			System.out.println("insufficient bank balance");
		}
	}
	
	public void deposit(int deposit)
	{
		bankBalance=bankBalance+deposit;
		System.out.println("your current balance is "+bankBalance);
	}
	
	public void checkBankBalance()
	{
		System.out.println("your current balance is "+bankBalance);
	}
	
	

}
