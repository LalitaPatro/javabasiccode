package Arrays;

public class palindrome {

	public static void main(String[] args) 
	{
               String name="madam";
               String palidrome="";
               
               for (int i=name.length()-1;i>=0;i--)
               {
            	   char c1=name.charAt(i);
            	   palidrome=palidrome+c1;
               }
               
               System.out.println(palidrome);
               if(name.equals(palidrome))
               {
            	   System.out.println("Is palindrdrome");
               }
               else
               {
            	   System.out.println("Is not a palindrdrome");

               }
	}
	

}
