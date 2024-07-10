package Basicjava;

public class parameterizedNonstatic_method 
{
	void add(int a,int b) //parameterized method
	{
		int sum = a+b;
		System.out.println(sum);
			
	}

	public static void main(String[] args) 
	{
		parameterizedNonstatic_method pm=new parameterizedNonstatic_method();
		pm.add(34, 6);
				
		

	}

}
