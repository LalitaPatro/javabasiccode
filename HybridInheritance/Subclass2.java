package HybridInheritance;

class Supclas 
{
	static void mul(int a,int b)
	{
		int multi=a*b;
		System.out.println("The multiplication of super class : " + multi);
	}
}

public class Subclass2 extends Supclas 
{
    static void division(int a,int b)
    {
    	int div = a/b;
    	System.out.println("The division of 2 numbers : "+div);
    }
	
}
