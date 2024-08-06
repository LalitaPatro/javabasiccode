package JavaAssigment1;
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) 
	{
       			
		    int n;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number to be checked");
			
			n=sc.nextInt();
			
			int i;
			int flag=0;
			
			int m;//
			
			m=n/2;//m=6/2=3
			
			if(n==0 || n==1)
			{
				System.out.println("Not a prime number");
			}
			
			else
			{
				for(i=2;i<=m;i++)//i=2,2<=3
				{
					if(n%i==0)//6%2==0
					{
						System.out.println("not a prime number");
						flag=1;
						break;
						
					}
				}
				
				if(flag==0)
				{
				
					System.out.println("It is prime number");
				}
				
			}
				
		}

	}


