package Arrays;

import java.util.Arrays;

public class Aray2 {

	public static void main(String[] args) 
	{

		String name[]= new String[3];
		name[0]="Ram";
		name[1]="Shyam";
		name[2]="Mehul";
		
		String name1[]= new String[3];
		name1[0]="Ram";
		name1[1]="Shyam";
		name1[2]="Mehul";
		
		System.out.println(Arrays.equals(name, name1));//for string use object
		
	}

}
