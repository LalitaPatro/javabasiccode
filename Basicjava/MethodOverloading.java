package Basicjava;

public class MethodOverloading 
{
	static void add(int a)
	{
		System.out.println(1);
	}
	static void sub(int a,boolean b)
	{
		System.out.println("2");
	}
	void multiply(int a,int b)//updating local variables
	{
		 a=2;
		 b=5;
		int mul =  (a*b);
		System.out.println(mul);
	}
	void divide(String a,char b)
	{
		System.out.println("4");
	}
	public static void main(String[] args)
	{
		MethodOverloading ml=new MethodOverloading();
		ml.multiply(2, 3);
		//ml.divide("test", 'B');
		add(23);
		sub(21,true);	
	}

}

//
