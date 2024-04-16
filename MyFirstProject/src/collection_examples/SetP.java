package collection_examples;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;

public class SetP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set a1= new TreeSet(); // To know the behaviour of listt interface
		a1.add("44545");
		a1.add("321");
		a1.add("Raju");
		a1.add("Sun");
		a1.add("Moon");
		
		 	Iterator i1 = a1.iterator();
		while(i1.hasNext()==true)
		{
			System.out.println(i1.next());
		}  

		/* ListIterator i2 =        a1.listIterator();          
		  while(i2.hasNext()==true)                       //Forward
		  {
			  System.out.println("Forward Iteration" +i2.next());
		  }
		System.out.println("==========================");
		  while(i2.hasPrevious()==true)               //Backward
		  {
			  System.out.println("Backward Iteration" +i2.previous());
		  }*/
		
	}

}
