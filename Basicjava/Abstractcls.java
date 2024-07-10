package Basicjava;
abstract class Mumbai
{
	abstract void Mumbai_pollution();//abstract method dont have any implementation
	abstract void mumbai_streetfood();
}

public class Abstractcls extends Mumbai
{

	public static void main(String[] args) 
	{
        Abstractcls c=new Abstractcls();
        c.Mumbai_pollution();
        c.mumbai_streetfood();
      }

	void Mumbai_pollution() 
	{
		System.out.println("I am concrete method1");
	}

	
	void mumbai_streetfood() 
	{
		System.out.println("I am concrete method2");
	}

}
