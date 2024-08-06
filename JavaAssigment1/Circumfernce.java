package JavaAssigment1;
public class Circumfernce {
	
	double pi= Math.PI;
	void areaofcircle()
	{
		int r = 5;
		double formula = pi*r*r;
		System.out.println("The area of circle is : " + formula);
	}
	 void circumferenceofcir()
	 {
		 int r2 = 6;
		 double formula2=2*pi*r2;
		 System.out.println("The circumfernce of circle is : " +formula2);
	 }

	public static void main(String[] args) 
	{
		
		Circumfernce cc=new Circumfernce();
		cc.areaofcircle();
		cc.circumferenceofcir();
	}

}
