//Utilizing Stack methods as:push(),pop(),peek()
package JavaAssigment1;

import java.util.Stack;

public class Stack_assignment {

	public static void main(String[] args) 
	{
			 Stack<String> s1 = new Stack<String>();
			 s1.add("Lalita");
			 s1.add("Savio");
			 System.out.println(s1.push("On top"));
			 s1.add("I am last");
			 System.out.println(s1);
			 System.out.println(s1.peek());
			 System.out.println(s1.pop());
	}

}
