package Basicjava;
class Signin
{
	Signin()//non-parameterized constructor you dont have give super() it will implicitly
	{
		System.out.println("I am in sign in page");
	}
}
class Registration extends Signin
{
	 Registration(String name)
	 {
		 System.out.println("I am Registration page : " + name);
	 }
}
class Login extends Registration
{
	Login(String name)//Parameterized constructor uh need call super explicitly
	{
		super("Savio");
		System.out.println("I am Login page : "+name);
	}
}
public class constructorsup extends Login
{
    constructorsup() 
   {
    	super("Lalita");
    	System.out.println("I am Signup page");
   }
	public static void main(String[] args) 
	{
      new constructorsup();
      
	}

}
