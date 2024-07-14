package Arrays;

import java.util.Arrays;

public class counttrue {

	public static void main(String[] args) 
	{
      
		String name="50cents";
		int count =0;

		char c1[]= name.toCharArray();
		//this will take each character and divide them into separate commas
		System.out.println(Arrays.toString(c1));
		
		for(int i =0;i<name.length();i++)
		{
		boolean b1=Character.isAlphabetic(c1[i]);
		//System.out.println(b1);
       		if(b1==true)
       		{
       			count=count+1;
       		}
       		
		}//is takes gives boolean value
		System.out.println("Alphabetic character true values :"+count);

		
	}

}
