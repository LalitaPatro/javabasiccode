package JavaAssigment1;

public class stringass {

	public static void main(String[] args) 
	{
			String name="Lalita Savio";
			System.out.println(name.isEmpty());//boolean value
			System.out.println(name.lastIndexOf('i'));//will take the last char index
			System.out.println(name.replace('S', 'M'));
			System.out.println(name.replaceAll("Savio", "Gaddam"));
			System.out.println(name.contains("Nimesh"));//gives the boolean value

			String lname="school123";//In the given string remove all numeric value
			System.out.println(lname.replaceAll("[0-9]", ""));
			System.out.println(lname.replaceAll("[a-z]", ""));//In given string School123 remove all lowercase letters
			System.out.println(lname.replaceAll("[A-Z]", ""));//replace all capital letters with nothing. 
			
			//check given string ends with i for string manish kumar tiwari
			String fname="Manish kumar tiwari";
			System.out.println(fname.matches("(.*)i"));
			//check given string starts with m 
			System.out.println(fname.matches("m(.*)"));//coming as expected provided caps m
			//check if letter k is present 
			System.out.println(fname.matches("(.*)k(.*)"));
			//check if given string tom,has 4 char or not
			String a1="tom";
			System.out.println(a1.matches("..."));
				
	}
	

}
