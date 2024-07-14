package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arayfirst {

	public static void main(String[] args) 
	{
		
		
		Scanner S1= new Scanner(System.in);
		boolean choc[] = new boolean[2];
		choc[0]=S1.nextBoolean();
		choc[1]=S1.nextBoolean();
		System.out.println( Arrays.toString(choc) );
		
		/**double number[]=new double[3];
		number[0]=S1.nextDouble();
		number[1]=S1.nextDouble();
		number[2]=S1.nextDouble();
		System.out.println( Arrays.toString(number) );**/
		
		char alpha[]= new char[4];
		alpha[0]='a';
		alpha[1]='b';
		alpha[2]='c';
		alpha[3]='e';
		
		for (int i=0;  i<=3;  i++)
		{
			System.out.println(alpha[i]);
		}
		
		String name="Lalita";
		char [] a1 = name.toCharArray();
		System.out.println(Arrays.toString(a1));	
		S1.close();
	}

}
