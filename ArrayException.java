package Basicjava;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayException {

	public static void main(String[] args) 
	{
       Scanner c1= new Scanner(System.in);    
       
       try
       {
    	   System.out.println("Please enter mobile number");
    	   long mobile_number= c1.nextLong();
    	   System.out.println("Your mobile number is " + mobile_number);
       }
       catch (InputMismatchException e)
       {
    	   System.out.println("You have entered incorrect values");
    	   Scanner s2= new Scanner(System.in);
    	   try 
    	   {
    		   System.out.println("Please enter again mobile number");
        	   long mobile_number1= s2.nextLong();
    		   System.out.println("mobile numer:" +mobile_number1);
    	   }
    	   catch(InputMismatchException a)
    	   {
        	   System.out.println("Please enter 10 digit mobile number");
        	    Scanner s1=new Scanner(System.in);
        	    long mobile=s1.nextLong();
     		   System.out.println("your mobile numer is :" +mobile);

    	   }
    	   s2.close();
}
       
      finally 
      {
		System.out.println("Practice will make you perfect");
	}
	}

}
