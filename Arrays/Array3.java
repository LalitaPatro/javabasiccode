package Arrays;

import java.util.Arrays;

public class Array3 {

	public static void main(String[] args) 
	{
				 int count_of_alpha=0;
				 int count_of_numeric=0;
				 int count_of_space=0;
				String input="17 October &#*!";
				char c1[]=input.toCharArray();
				System.out.println(Arrays.toString(c1));
				for(int i=0;i<input.length();i++)
				{
					boolean b1=Character.isAlphabetic(c1[i]);//count alphabets
					boolean b2=	Character.isDigit(c1[i]);//count numeric values
					boolean b3=	Character.isWhitespace(c1[i]);//count spaces
					if(b1==true)
					{
						count_of_alpha++;
					}
					if(b2==true)
					{
						count_of_numeric++;
					}
					if(b3==true)
					{
					    count_of_space++;	
					}
				}
				System.out.println("Total number of aplhabets are -> "+count_of_alpha);
				System.out.println("Total number of numeric are -> "+count_of_numeric);
				System.out.println("Total number of space are -> "+count_of_space);
				int count_special_character = input.length()-(count_of_alpha+count_of_numeric+count_of_space);
				System.err.println("Total special characters are ->"+ count_special_character);


			}
	}


