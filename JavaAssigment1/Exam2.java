package JavaAssigment1;

import java.util.Scanner;

public class Exam2 
{
	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
		int[] store= new int[4];
		store[0]=s1.nextInt();
		store[1]=s1.nextInt();
		store[2]=store[0];
		store[3]= store[1];
		
		
		System.out.println("The area of rectange is : " + (store[0]*store[1]) );
	}

}
