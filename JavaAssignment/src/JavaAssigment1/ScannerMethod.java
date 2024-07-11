package JavaAssigment1;
import java.util.Scanner;

public class ScannerMethod {

	public static void main(String[] args)
	{
			Scanner S1=new Scanner(System.in);
		    int a = S1.nextInt();
		    float b = S1.nextFloat();
		    byte c = S1.nextByte();
		    boolean d= S1.nextBoolean();
		    String name = S1.next();
		    long e = S1.nextLong();
		    String line = S1.nextLine();
		    System.out.println("Print all scanner methods : " + a  +" "+ b +" "+ c +" "+ d +" "+ name +" "+ e +" "+ line );
		    S1.close();
		    
	}

}
