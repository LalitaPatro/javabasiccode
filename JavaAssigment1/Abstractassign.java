package JavaAssigment1;
abstract class Class3
{
	abstract void Visa();
	abstract void Upi();
}
class class2 extends Class3
{
    static void Paymentmethod()
    {
    	 System.out.println("Payment mode online");
    }
    void DD() 
    {
    	System.out.println("Payment through DD");
    }
	void Visa() 
	{
        System.out.println("I M OVERRIDENN");		
	}
	void Upi() 
	{
         System.out.println("I M OVERRIDDEN TOO");		
	}
}
public class Abstractassign extends class2
{
	public static void main(String[] args) 
	{
	    	Abstractassign a1=new Abstractassign();
	    	class2.Paymentmethod();
	    	a1.DD();
	    	a1.Visa();
	    	a1.Upi();
	}

}
