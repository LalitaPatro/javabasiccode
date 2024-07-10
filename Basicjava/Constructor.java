 package Basicjava;

public class Constructor 
{
	Constructor()//non-static , non-parameterized
	{
		System.out.println("I am 1");
	}
	Constructor(String name)//parameterized constructor
	{
		System.out.println("I am 2");
	}
	Constructor(String exp,int a)
	{
		System.out.println("Am Constructor Overloading");
	}
	public static void main(String[] args) 
	{
		new Constructor();
		new Constructor("Lalita");
		new Constructor("Savio",10);
	}

}
