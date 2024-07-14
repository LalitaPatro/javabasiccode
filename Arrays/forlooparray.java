package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class forlooparray {

	public static void main(String[] args) 
	{
        Scanner s1=new Scanner(System.in);
        double[] choco=new double[2];
        boolean tf[]=new boolean[2];
        for(int i=0;i<2;i++)//using both in same loop possible where the size of aaray would be same
        {
        	System.out.println("Please enter double values :" +i);
        	choco[i]=s1.nextDouble();
        	System.out.println("Please enter boolean values :" +i);
        	tf[i]=s1.nextBoolean();
        	
        }
       System.out.println(Arrays.toString(tf));
        System.out.println(Arrays.toString(choco));
        System.out.println("The end of loop");
  
	}

}
