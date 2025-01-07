package employeeClassLearn;

public class EmployeeDataWithConstructor {
	int id;
	String empName;
	int age;
	int sal;
	static String dept="QA";
	String pnNo;
	String address;
	char gender;
	String company; 
	static String trainingInstute="QT";
	
	EmployeeDataWithConstructor(int eID,String eName,int eAge,int eSal,String ePN,String eAddress,char eGender,String eCompany)
	{
		id=eID;
		empName=eName;
		age=eAge;
		sal=eSal;
		pnNo=ePN;
		address=eAddress;
		gender=eGender;
		company=eCompany;
	}
	
	
	public void displayData()
	{
		
		System.out.println("This is employee id: "+id);
		System.out.println("This is employee Name: "+empName);
		System.out.println("This is employee age: "+age);
		System.out.println("This is employee sal: "+sal);
		System.out.println("This is employee department: "+dept);
		System.out.println("This is employee Phone no: "+pnNo);
		System.out.println("This is employee address: "+address);
		System.out.println("This is employee gender: "+gender);
		System.out.println("This is employee company: "+company);
		System.out.println("This is employee instute: "+trainingInstute);
		System.out.println("********************************************");
		
	}
	
	
	public static void main(String[] args) {
		
		EmployeeDataWithConstructor o=new EmployeeDataWithConstructor(001,"Ram",20,100000,"9999999999","hyderabad",'m',"Amazon");
		
		o.displayData();
		
		
		
		EmployeeDataWithConstructor o1=new EmployeeDataWithConstructor(002,"Krish",20,150000,"9999999999","hyderabad",'m',"Apple");
		
		o1.displayData();
		
		EmployeeDataWithConstructor o2=new EmployeeDataWithConstructor(003,"Geeta",20,200000,"9999999997","hyderabad",'f',"MS");
		
		o2.displayData();
		
	}

}
