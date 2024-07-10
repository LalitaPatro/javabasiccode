package Basicjava;

public class Addition 
{
	static void add()
	{
		int a1=20;
		int a2=30;
		int sum = a1+a2;
		System.out.println(sum);
	}
	static void sub()
	{
		int a1=20;
		int a2=30;
		int sub = a1-a2;
		System.out.println(sub);
	}
	static void multiply()
	{
		int a1=20;
		int a2=30;
		int mul = a1*a2;
		System.out.println(mul);
	}
	static void divide()
	{
		int a1=40;
		int a2=20;
		int divide = a1/a2;
		System.out.println(divide);
	}
	static void modulus()
	{
		int a1=40;
		int a2=20;
		int mod = a1%a2;
		System.out.println(mod);
	}
	public static void main(String[] args) 
	{
		add();
		sub();
		multiply();
		modulus();
		divide();
			
	}

}
