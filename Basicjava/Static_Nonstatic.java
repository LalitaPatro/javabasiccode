package Basicjava;

public class Static_Nonstatic {
	
	static void sub(int a1,int b2) // static
	{
		System.out.println("Subtraction of 2 number : " + (a1-b2));
	}
	
	 void add(int a, int b) //non-static method
	{
		a=10;
		b=20;
		int sum=a+b;
		System.out.println("The addition is performed : "+sum);
	}
	 
	public static void main(String[] args) 
	{
		Static_Nonstatic sn = new Static_Nonstatic();
		sn.add(0, 0);
		sub(23,4);
	}

}
