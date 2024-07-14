/**Write a program to find out alphabets in a given string (Eg: Name123, 50cents)*/
package Arrays;

import java.util.Arrays;

public class Array_boolean {

	public static void main(String[] args) 
	{
       String name="50cents lalita 987654321";
       char c1[]=name.toCharArray();
       System.out.println(Arrays.toString(c1));
       int count=0;
       
       for(int i=0;i<name.length();i++)
       {
    	   boolean b1=Character.isAlphabetic(c1[i]);
    	   if (b1==true)
    	   {
    	   count++;
    	   }
       }
       System.out.println(count);
	}

}
