package JavaAssigment1;
abstract class parent
{
	abstract void add();
	abstract void sub();
	void multi() 
	{
		int a =10;int b=20;int mul=a*b;
		System.out.println("The multiplication is : " +mul);
	}
	void div()
	{
		int a1=40;int b1=5;int divi=a1/b1;
		System.out.println("The division is :" +divi);
	}
	
}
public class strnfmethod extends parent
{

	public static void main(String[] args) 
	{
		strnfmethod S1= new strnfmethod();
		S1.add();
		S1.multi();
		S1.printme();
		S1.sub();
		S1.printout();
		S1.div();
	}
	void add() 
	{
		System.out.println("I am overide 1");
	}
	void sub() 
	{
		System.out.println("I am override 2");
	}
	void printme()
	{
		System.out.println("1st concrete method");;
	}
    void printout()
    {
    	System.out.println("I am printour");
    }
}
