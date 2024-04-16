package collection_examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedListProperties {

	public static void main(String[] args) {
		  
		
		LinkedList li = new LinkedList();
		  li.add(12);   //Dynamic because we can add elements without giving size..growable
		  li.add(15);
		  li.add(10);
		  System.out.println(li); // Follows indexing //Output [12, 15, 10]
		  li.add(15);   //Check Duplicate
		  li.add(15);   //Check Duplicate
		  System.out.println(li);    //  [12, 15, 10, 15, 15]
		  li.add("aa");    //Heterogeneous
		  System.out.println(li);     //12, 15, 10, 15, 15, aa]
		  li.add(null);  
		  li.add(null); 
		  System.out.println(li);  //[12, 15, 10, 15, 15, aa, null, null]
		  
		  ArrayList l2 = new ArrayList();
		 
		  l2.add(12);   
		  l2.add(15);
		  l2.add(10);
		  Collections.sort(l2);    //Sorting [10, 12, 15]

		  System.out.println(l2);
		  

	}

}
