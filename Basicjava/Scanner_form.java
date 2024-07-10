package Basicjava;
//Write a program to make a form where the user is able to input his information. 
//The following information is required:

import java.util.Scanner;

public class Scanner_form {

	public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("Welcome to Java");
        System.out.println("Please enter first name : ");
        String name = s1.next();
        System.out.println("Please enter last name : " );
        String lname = s1.next();
        System.out.println("Please enter your email address : ");
        String eadd = s1.next();
        System.out.println("Please enter your password : " );
        String pwd = s1.next();
        System.out.println("Gender: " );
        String gen = s1.next();
        System.out.println("Permanent address : " );
        String peradd = s1.next();
        System.out.println("Present address : " );
        String pradd = s1.next();
        System.out.println("Pincode : " );
        long pin=s1.nextLong();
        System.out.println("Thankyou for filling up the form " + name +" " + lname);
        
        
	}

}
