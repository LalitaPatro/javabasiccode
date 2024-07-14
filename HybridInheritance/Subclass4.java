package HybridInheritance;

class grand extends Subclass3
{
	void multipurpose()
	{
		System.out.println("I am multipurpose class in grand super");
	}
}
class sup extends grand
{
	void singlepurpose()
	{
		System.out.println("I can be executed once");
	}
}
public class Subclass4 extends sup
{   
	void inheriting(String name)
	{
		name="I am Lalita";
		System.out.println("I am inheriting from hybrid class " + name);
	}
	
	public static void main(String[] args) 
	{
		Subclass4 s1= new Subclass4();
		s1.inheriting("Savio");
		s1.singlepurpose();
		s1.multipurpose();
		addition(23, 24);
		division(25, 5);
		mul(2, 4);
	}

}
