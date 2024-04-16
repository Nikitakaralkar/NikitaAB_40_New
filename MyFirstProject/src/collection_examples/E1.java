package collection_examples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class E1 {

	public static void main(String[] args) {


		
		ArrayList a1 = new ArrayList();
		a1.add("4454");
		a1.add(321);
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
		  }
		 */

	}

}
