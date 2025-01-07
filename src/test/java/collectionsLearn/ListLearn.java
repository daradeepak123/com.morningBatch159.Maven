package collectionsLearn;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;

public class ListLearn {

	public static void main(String[] args) {
		
	
		Scanner sc=new Scanner(System.in);
		List<Integer> num=new Vector<Integer>();
		
		num.add(10);
		num.add(50);
		num.add(60);
		num.add(10);
		num.add(50);
		num.add(60);
		num.remove(0);
		num.add(0, 50);
		num=num.reversed();
		num.clear();
		for(int n:num)
		{
			System.out.println(n);
		}
		
		Random ran=new Random();
		
		for(int i=0;i<100;i--)
		{
			num.add(ran.nextInt(1000));
			if(num.size()>200)
			{
			break;
			}
		}
		for(int n:num)
		{
			System.out.println(n);
		}

	}

}
