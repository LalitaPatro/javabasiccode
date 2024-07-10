package Basicjava;

public class NestedIfelse {

	public static void main(String[] args) 
	{
		char gender_1='M';
		char gender_2='F';
		int age_kid=4;
		//int age_male_adult=30;
		//int age_female_adult=29;
		
		if(gender_1=='M')
		{
			System.out.println("Check the age of male");
			{
			 if(age_kid !=4)
			{
				System.out.println("Ticket is free");}
				
					else if(gender_2 !='F')
					{
						System.out.println("Ticket is free");

					}
					else 
					{
						System.out.println("Need to pay for ticket");
					}
					
				}
			}
			
			
		}
	}


