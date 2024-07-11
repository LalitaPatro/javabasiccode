package JavaAssigment1;

public class forloop {
	
	final static double pi=Math.PI;//global means your wont change and keep on repeating same number
	
	public static void main(String[] args) 
	{
		for (double i=0;i<10;i++)
		{
			 double r=Math.random();//keeps on changing you have to declare inside for loop
			 double formula=pi*r*r;
			
			System.out.println("The area of circle :" +formula);
		}
	}

}
