package Basicjava;

public class Global_varibale2  
{
    int no_of_days=365;// non-static variable can be declared and intialized in a single line
    int days=31;
    static String name;// will give the default value
    static double s1;
    
	public static void main(String[] args)
	{
		Global_varibale2 gv2= new Global_varibale2();
		System.out.println("first gv value" + gv2.no_of_days);
		gv2.no_of_days=366;
		System.out.println(gv2.no_of_days);
		int c;
		c=100;
		System.out.println(c);
		System.out.println(name);
		System.out.println(s1);

	}

}
