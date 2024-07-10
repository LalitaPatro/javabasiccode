package Basicjava;

import java.util.Scanner;

public class Scannerclas {

	public static void main(String[] args) 
	{
		 Scanner s=new Scanner(System.in);//used to take the input
		 System.out.println("Please enter a number ");
		 int a = s.nextInt();
		 System.out.println("Please enter b number ");
		 int b = s.nextInt();
		 int sum=a+b;
		 System.out.println("The addition of 2 number" + sum);
	}

}
