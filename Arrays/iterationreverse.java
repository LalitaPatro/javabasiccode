package Arrays;

public class iterationreverse {

	public static void main(String[] args)
	{
		 String name="Lalita";
		 String output="";
		 
		 for(int i = name.length()-1;i>=0;i--)
		 {
			 char c1=name.charAt(i);
			 output=output+c1;
			 
		 }
		System.out.println(output);

	}

}
