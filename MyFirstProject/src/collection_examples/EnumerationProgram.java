package collection_examples;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationProgram {

	public static void main(String[] args) {
		
		
		Vector v= new Vector();
		v.add(10);
		v.add(5);
		v.add("Nikita");
		v.add(15.5);
		Enumeration e= v.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		
		

	}

}
