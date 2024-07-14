package HybridInheritance;

public class Subclass1 extends Subclass3 
{
	static void sub() 
	{
		int a=20;
		int b=30;
		int sub =  a -  b;
		System.out.println("calling subclass1 : " + sub);
		
	}
	public static void main(String[] args) 
	{
		addition(39, 32);
		sub();
		
	}

}
