package Basicjava;

class maths
{
	final static double pi = Math.PI;

	static void areaofcircle(double r)
	{
		double area=pi*r*r;
		System.out.println("area of circle :" +area);	
	}
}

public class Mutlilevelstatic extends maths
{
     static void circumferenceofcircle(double r2)
     {
		 double formula2=2*pi*r2;
			System.out.println("circumfernce of circle :" +formula2);
     }
	public static void main(String[] args) 
	{
        circumferenceofcircle(2);
        areaofcircle(3.23);
	}

}
