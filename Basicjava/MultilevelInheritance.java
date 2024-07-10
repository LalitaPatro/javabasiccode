package Basicjava;

class SuperSupercls
{
	void add(int a,int b)
	{
		System.out.println("I am addition "+ (a+b));
	}
}

class subsuper extends SuperSupercls
{
	void minus(int a1,int b2)
	{
		System.out.println("I am subtraction : " +(a1-b2));
	}
}

public class MultilevelInheritance extends subsuper
{
	
	void mul()
	{
		int a = 20;
		int b = 23;
		int mul=a*b;
		System.out.println("I am multiplication :" + mul );
	}
	
	
	public static void main(String[] args) 
	{
		MultilevelInheritance m1 =  new MultilevelInheritance();
		m1.mul();
		m1.minus(23, 20);
		m1.add(32, 23);
	}

}
