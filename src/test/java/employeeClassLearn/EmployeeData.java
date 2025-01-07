package employeeClassLearn;

public class EmployeeData {
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
	
	EmployeeData(int eID,String eName,int eAge,int eSal,String ePN,String eAddress,char eGender,String eCompany)
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
		
		EmployeeData o=new EmployeeData(001,"Ram",20,100000,"9999999999","hyderabad",'m',"Amazon");
		o.id=001;
		o.empName="Ram";
		o.age=20;
		o.sal=100000;
		o.pnNo="9999999999";
		o.address="Hyderabad";
		o.gender='m';
		o.company="amazon";
		o.displayData();
		
		
		
//		EmployeeData o1=new EmployeeData();
//		
//		o1.id=002;
//		o1.empName="Krish";
//		o1.age=20;
//		o1.sal=150000;
//		o1.pnNo="9999999998";
//		o1.address="Hyderabad";
//		o1.gender='m';
//		o1.company="Apple";
//		o1.displayData();
//		
//		EmployeeData o2=new EmployeeData();
//		o2.id=003;
//		o2.empName="Geeta";
//		o2.age=21;
//		o2.sal=200000;
//		o2.pnNo="9999999997";
//		o2.address="Hyderabad";
//		o2.gender='f';
//		o2.company="MS";
//		o2.displayData();
		
	}

}
