package Basicjava;

class Parent
{
	void Newuser()//method riding creating method of same name with differnt implementation
	{
		System.out.println("Please register yourself");
	}
}

	
public class Methodoverriding extends Parent
{
	void Newuser()
	{
		super.Newuser();//having super keyword will call the parent class method 
		System.out.println("Or please login");
	}

	public static void main(String[] args) 
	{
			Methodoverriding m1= new Methodoverriding();
			m1.Newuser();
	}
	

}
