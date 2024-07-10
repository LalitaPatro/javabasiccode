package Basicjava;

public class Stringfunc 
{

	public static void main(String[] args) 
	{
       String name="Lalita Patro";
       String name1="Lalita patro";

       //int count = name.length();
       System.out.println("Length : "+name.length());
       String last_name="GADDAM";
       System.out.println("Lowercase : "+last_name.toLowerCase());
       String statement="school name is vidya";
       System.out.println("Uppercase :" + statement.toUpperCase());
       System.out.println("Finding of character v :" +statement.charAt(15));
       System.out.println("Finding index of character n : "+statement.indexOf('n'));
       String concept ="     I love java    ";
      
       System.out.println("Remove spaces :" +concept.trim());
       String last_name1="GADDAM";
       System.out.println("Equals or not the value for last name: " + last_name.equals(last_name1));
       System.out.println("Negative value: "+name.equals(name1));
       String test="Waterfall";
       String test1="waterfall";
       System.out.println("Needs to provide positive value :" + test.equalsIgnoreCase(test1));
       String methodology="Agile";
       String methodology1="Agilest";
       System.out.println("Needs to provide negative value : " + methodology.equalsIgnoreCase(methodology1));
       
       System.out.println(concept.contains("java"));
       System.out.println(concept.contains("lalita"));
       
       System.out.println(test.substring(2));//single parameter
       System.out.println(statement.substring(7, 20));//to remove school 
       

       
	}

}
