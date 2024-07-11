package JavaAssigment1;

import java.util.Scanner;

public class Scanner_Math {

	final static double pi=Math.PI;
	
	public static void main(String[] args) 
	{
			Scanner s1= new Scanner(System.in);
			System.out.println("----Welcome to Math World----");
			System.out.println("To find the area of circle please enter the radius : ");
			double r = s1.nextDouble();
			double formula	= pi*r*r;
			double formula2 = 2*pi*r;
			System.out.println("The area of circle is :" + formula + " & circumference of circle is : " 
			+formula2);
			
			//area of square and circumference
			System.out.println("To find the area & perimeter of square please enter one side : ");
			
			double a = s1.nextDouble();
			double formula3 = 4*a;
			double formula4 = a*a;
			System.out.println("The area of the square is : " + formula3 + " & perimeter is : " +formula4);
			
			//reactangle
			System.out.println("To find the area & circumference of triangle please enter base & height : ");
			
			float b = s1.nextFloat();
			float h = s1.nextFloat();
			float a1 = s1.nextFloat();
			float formula5 = (h*b)/2;
			//double a1 = Math.random();
			double formula6 = a1+b+h;
		    System.out.println("The area of the traingle is : " + formula5 +" & circumference of triange is : "
			+ formula6);
			//area of rectangle
			System.out.println("To find the area & circumference of rectangle please enter length & width : ");
			int l = s1.nextInt();
			int w = s1.nextInt();
			int f7= l*w;
			int f8 = ((2*l) + (2*w));
			System.out.println("The area of the rectangle is : " + f7 +" & circumference of rectangle is : "+ 
			f8);
			//trapezium
			System.out.println("To find the area & circumference of trapezium please enter length & width : ");
			
			float a2 = s1.nextFloat();
			float b1 = s1.nextFloat();
			float h1 = s1.nextFloat();
			float f9 = ((a2+b1)/2)*h1;
			float d = s1.nextFloat();
			float f10 = a2+b1+h1+d;
			System.out.println("The area of the trapezium is : " + f9 +" & circumference of trapezium is : "+ f10);


			
			
	}

}
