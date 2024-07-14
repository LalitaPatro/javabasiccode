package Arrays;

import java.util.Arrays;

public class Stringarray {

	public static void main(String[] args) 
	{
       
		String name[]= new String[3];
		String lname[]=new String[3];
		
		name[0]="Lalita";
		name[1]="Savio";
		name[2]="Nimesh";
		
		for(int i=0;i<=2;i++)
		{
			//char c1[]=name.charAt(i);
			lname[i]=name[i];
			
			
		}
		System.out.println(Arrays.toString(name));
		System.out.println(Arrays.toString(lname));	
	}

}
