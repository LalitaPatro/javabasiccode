package Arrays;

import java.util.Arrays;

public class anagram {

	public static void main(String[] args) 
	{
        String s1="secure";
        String s2="rescue";
        char[] c1=s1.toCharArray();
        char[] c2=s2.toCharArray();
        
        System.out.println(Arrays.toString(c1));
        System.out.println(Arrays.toString(c2));
        
        Arrays.sort(c1);
        System.out.println("After sorting c1 : "+Arrays.toString(c1));
        Arrays.sort(c2);
        System.out.println("After sorting c1 : "+Arrays.toString(c2));
        
        boolean b1= Arrays.equals(c1, c2);
        if(b1==true)
        {
        	System.out.println("They are anagram");
        }
        else 
        {
        	System.out.println("They are not anagram");
        }
        
        
        
	}

}
