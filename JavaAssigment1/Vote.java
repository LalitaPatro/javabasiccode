package JavaAssigment1;

public class Vote {
	
	public static void main(String[] args)
	{
		int age1=17;
		int age2=25;
		
		if(age1 == 17)
		{
			System.out.println("Not Eligible for vote");
		}
		else if (age2 >=25)
		{
			System.out.println("Eligible for vote");
		}
		else
		{
			System.out.println("Happy voting");
		}
	}

}
