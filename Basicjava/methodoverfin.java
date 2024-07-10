package Basicjava;
class Parent
{
	final void add()
	{
		System.out.println("Lets see if this executes");
	}
}

public class methodoverfin extends add
{
	
	void add()
	{
		System.out.println("Child will execute");
	}
	public static void main(String[] args) 
	{
		methodoverfin f = new methodoverfin();
		f.add();
       
	}

}
