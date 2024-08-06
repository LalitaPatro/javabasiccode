package JavaAssigment1;

import java.util.Arrays;

public class Exam 
{
	public static void main(String[] args)
	{
		String name = "world is full of beautiful people";
		int count =0;
        char c1[]= name.toCharArray();
        for(int i=0;i<=name.length(); i++)
        {
        	count++;
        }
		
		System.out.println("The total alhpabets are :" + count);
		System.out.println(Arrays.toString(c1));
		
	}
}
