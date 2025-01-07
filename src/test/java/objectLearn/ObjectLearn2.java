package objectLearn;

public class ObjectLearn2 {
	
	
	

	public static void main(String[] args) {
		ObjectLearn1 obj=new ObjectLearn1();
		System.out.println(obj.b);
		obj.learnObjNonStatic1();
		
		obj.b=30;
		System.out.println(obj.b);
		
		System.out.println(ObjectLearn1.abc);
		ObjectLearn1.learnObj1();
		
		System.out.println();

	}

}
