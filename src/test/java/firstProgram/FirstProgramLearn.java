package firstProgram;

public class FirstProgramLearn {
	
	
	public static void welcomeStudents(String studentname)
	{
		System.out.println("hello "+studentname+", welcome to quality thought");
		System.out.println("classes starts by 8");
		System.out.println("will discuss Java");
		System.out.println("will discuss selenium");
		System.out.println("will do practicals");
		System.out.println("classes ends by 9:30");
		System.out.println("**************************");
		
	}
	
	
	public static void hello()
	{
		welcomeStudents("newStudent");
		
	}
	

	public static void main(String args[])
	{
		
		
		welcomeStudents("student1");
		welcomeStudents("student2");
		welcomeStudents("student3");
		welcomeStudents("student4");
		welcomeStudents("student5");
		hello();
	}
	
	
}
