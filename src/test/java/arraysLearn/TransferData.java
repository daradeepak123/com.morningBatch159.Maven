package arraysLearn;

public class TransferData {	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]= new int[100];
		
		for(int i=0;i<num.length;i++)
		{
			num[i]=i+1;
		}
		
		int tranNum[]=new int[num.length];
		
		for(int i=0;i<num.length;i++)
		{
			tranNum[i]=num[i];
		}
		
//		for(int aa:num)
//		{
//			System.out.println(aa);
//		}
		int n=99;
//		for(int i=0;i<num.length;i++)
//		{
//			System.out.println(tranNum[i]+num[n--]);
//		}
		
		for(int i=25;i<40;i++)
		{
		System.out.println(num[i]);
		}
		
	}

}
