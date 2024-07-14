package Arrays;

import java.util.Arrays;

public class Iteration {

	public static void main(String[] args)
	{
		int a[]= new int[3];
		int b[]= new int[3];
		
		a[0]=23;
		a[1]=21;
		a[2]=34;
		for(int i=0;i<=2;i++)
		{
			b[i]=a[i];
		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
	}
	
	
}
