package collection_examples;

import java.util.Enumeration;
import java.util.Stack;

public class StackProgram {

	public static void main(String[] args) {
		
		Stack<String> s1= new Stack();
		s1.add("16");
		s1.add("11");
		s1.add("11");
		s1.add("11");
		s1.add("11");
		s1.add("13");
		s1.add("12");
		 System.out.println(s1);
		s1.pop();
		System.out.println(s1);
		System.out.println(s1.peek());
		System.out.println(s1);
		System.out.println(s1.push("111"));
		System.out.println(s1);
		System.out.println(s1.search("11")); 
		
		/* Enumeration e= s1.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		*/
		
		 
	}

}
