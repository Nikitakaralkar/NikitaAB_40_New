package collection_examples;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetProgram {

	public static void main(String[] args) {
		
		
		Set s = new TreeSet(); // To know the behaviour of Set interface
		 s.add(12);   //Dynamic because we can add elements without giving size..growable
		  s.add(15);
		  s.add(10);
		  System.out.println(s); // Do not follow indexing //Output [10, 12, 15]
		  s.add(15);   //Check Duplicate
		  s.add(15);   //Check Duplicate
		  System.out.println(s);    //  Do not store duplicate values [10, 12, 15]
		  s.add(null);  
		  //s.add(null); 
		  System.out.println(s);  // Giving exception not allowing to store 1 null also
		  
		

	}

}
