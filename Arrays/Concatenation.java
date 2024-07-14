package Arrays;

import java.util.Arrays;

public class Concatenation {

	public static void main(String[] args) 
	{
		 String fname="Lalita";
		 String lname="Patro";
		 
		 System.out.println(fname.concat(" ").concat(lname));
		 
		 String mname="my name is ram";
		String [] a1= mname.split(" ");//splited the string into array whereever, there is space it separate the string with comma
		String [] a2=mname.split("o", 2);
		String name = (mname.substring(0, 10));
		String rname= mname.substring(11, 14);
		System.out.println(rname);
		//String a[]= name+","+rname;
		
		
		System.out.println(Arrays.toString(a2));
	}

}
