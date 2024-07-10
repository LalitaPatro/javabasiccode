package Basicjava;
import java.util.Scanner;

public class Methodof_Scanner {

	public static void main(String[] args) 
	{
      Scanner s1=new Scanner(System.in);
      
      String name = s1.next();
      int age = s1.nextInt();
      byte b1 =s1.nextByte();
      short s2 =s1.nextShort();
      long l1=s1.nextLong();
      boolean b = s1.nextBoolean();
      float f=s1.nextFloat();  
      s1.close();

	}
}
