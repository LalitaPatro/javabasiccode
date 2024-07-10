package Basicjava;

public class ConstrutorOverloading 
{
	ConstrutorOverloading(String name)
	{
		System.out.println("I am parameterized");
	}
	ConstrutorOverloading() 
	{
		this("Lalita");
		System.out.println("I am non paramterized");
	}
	ConstrutorOverloading(boolean t)
	{
		this();
		System.out.println("I am boolean value");
	}
	
	public static void main(String[] args) 
	{
			new ConstrutorOverloading(true);
	}

}
