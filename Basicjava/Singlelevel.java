package Basicjava;

class Superclass
{
	static void loginpage()
	{
		String fist_name = "Lalita Patro";
		System.out.println("Welcome to MKT " + fist_name);
		
	}
}

public class Singlelevel extends Superclass
{
       
	static void Core_java()
	{
		System.out.println("I love java language");
	}
	void automation()
	{
		System.out.println("Explore to automation");
	}
	
	public static void main(String[] args) 
	{
			Singlelevel s1 = new Singlelevel();
			s1.automation();
			Core_java();
			loginpage();
			
			
			
	}

}
